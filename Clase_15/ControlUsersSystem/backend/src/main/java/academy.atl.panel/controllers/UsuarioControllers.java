package academy.atl.panel.controllers;
//package academy.atl.panel.models;
import academy.atl.panel.models.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioControllers {

    static List<Usuario> usuarios = new ArrayList<>();
    @GetMapping ("/api/usuarios") // consultar (listar) TODOS los usuarios
    public List<Usuario> listarUsuario() {
        return usuarios;
    }

    @DeleteMapping("/api/usuarios/{id}") // eliminar usuario id
    public void eliminarUsuario(@PathVariable String id)    {

        //Usuario usuarioEncontrado= usuarios.stream().filter(user->user.getId().equals(id)).findFirst().get(); // ojoo tema avanzado pero muy actual...
	//usuarios.remove(usuarioEncontrado);
        if (!usuarios.isEmpty()) // aqui con un for tradicional
        {
            for (Usuario usr : usuarios) {
                if (id.equals(usr.getId().toString())) {
                    usuarios.remove(usr);
                    break;
                }
            }
        }
    }

    @PostMapping("/api/usuarios") // Crear usuario
    //public void agregarUsuario(@RequestBody Usuario user) { //  aqui recibe un usuario y lo va a gregar
    public void  agregarUsuario(@RequestBody Usuario usr) {
        if (usr.getId() == null) {
            usr.setId(usuarios.size()+1); //manuel
        }
        usuarios.add(usr);
    }
}
