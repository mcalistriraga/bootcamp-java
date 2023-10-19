import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class ChatGptClient {
    public JSONObject enviarPregunta(String preguntaUsuario) {

        String apiKeyYvonne = "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"; //YVONNE-API-KEY

        JSONObject contentMainObject = null;

        try {
            // URL de la API de ChatGPT
            URL url = new URL("https://api.openai.com/v1/chat/completions");

            // Establecer la conexión HTTP
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");

            // Establecer los encabezados de la solicitud
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Authorization", "Bearer " + apiKeyYvonne);

            connection.setDoOutput(true);
            DataOutputStream outputStream = new DataOutputStream(connection.getOutputStream());

            // Crear el cuerpo de la solicitud
            String requestBody = buildRequestBody(preguntaUsuario); // arma la consulta completa

            // Enviar la solicitud
            outputStream.writeBytes(requestBody);
            outputStream.flush();
            outputStream.close();

            // Obtener la respuesta
            int responseCode = connection.getResponseCode();
            BufferedReader inputReader;
            if (responseCode == HttpURLConnection.HTTP_OK) {
                inputReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            } else {
                inputReader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
            }

            // Leer la respuesta línea por línea
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = inputReader.readLine()) != null) {
                response.append(inputLine);
            }
            inputReader.close();

            // "response" es el objeto StringBuilder que contiene la respuesta JSON
            String jsonResponse = response.toString(); // Convierte el StringBuilder a una cadena

            contentMainObject = getContentMainOfJsonResponse(jsonResponse);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return contentMainObject;
    }

    public JSONObject getContentMainOfJsonResponse(String jsonResponse) {
        JSONObject contentObject= null;

        try {
            JSONObject mainObject = new JSONObject(jsonResponse);

            // Acceder a los elementos del  array "choices"
            JSONArray choicesArray = mainObject.getJSONArray("choices");

            // El array choicesArray contiene un objeto, obter ese objeto (en este caso, suponemos que solo hay un elemento en el array)
            JSONObject choiceObject = choicesArray.getJSONObject(0);

            // Acceder al Objeto "message"
            JSONObject messageObject = choiceObject.getJSONObject("message");

            // Acceder al String "content"
            String  contentString = messageObject.getString("content");

            // Acceder al Objeto "content"
            contentObject = new JSONObject(contentString);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return contentObject;
    }


    
    private static String buildRequestBody(String preguntaUsuario) {

        String requestBody = "{\n" +
                "  \"model\": \"gpt-3.5-turbo\",\n" +
                "  \"messages\": [\n" +
                "    {\"role\": \"system\", \"content\": \"Eres un asistente util.\"},\n" +
                "    {\"role\": \"user\", \"content\": \"" + preguntaUsuario + "\"}\n" +
                "  ]\n" +
                "}";

        return requestBody;
    }
}
