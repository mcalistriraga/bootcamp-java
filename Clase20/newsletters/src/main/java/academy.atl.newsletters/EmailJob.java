package academy.atl.newsletters;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@EnableScheduling  // ESTA ANOTACION: PERMITE EJECUTAR FUNCIONESDE NOCHE A LA HORA Q NOSOTROS QUERAMOS
public class EmailJob {
    // @Scheduled(cron = "0 0 3 ? * MON")  // puede servir para limpiar la base de datos, TAREAS AUTOMATIZADAS
    //public void generarBackupDELaBaseDeDatos() {  // ojoo PEDIR A ChatGPT que lo configure OJJJJJO
        //.....
    //}

    @Scheduled(cron = "0 0 3 ? * MON")  // se ejecuta a las 3 de la mañana. Con la conf reqierida se ejecuta cualquier dia a determinada hora
    public void enviarCampanaDeMarketing() {
    }
}
