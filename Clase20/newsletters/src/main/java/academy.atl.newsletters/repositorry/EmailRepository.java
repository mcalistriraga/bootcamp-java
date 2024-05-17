package academy.atl.newsletters.repository;

import academy.atl.newsletters.models.Lead;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmailRepository {

    @PersistenceContext
    private EntityManager baseDeDatos;

    @Transactional

    public String  guardarEmail(String emailDelUsuario) { // CONSULTA PARAMETRIZADA

        // en HQL, no se llama la tabla lead  sino al objeto de la clase Lead
        // aqui se usa el nombre de clase @Table(name = "`lead`"),
        // el nombre es     @Column(name = "email")
        // private          String email; <-- este nombre de variable es el que se usa
        //                                    en la consulta y no el que esta entre comillas

        String consultaSql = "INSERT INTO Lead (email) VALUES (:paramEmail)";
                     // OJOOO OBSERVA QUE Lead ES EL NOMBRE DE LA CLASE EN "Lead.java", es decir en: "public class Lead {"
                                          // , "email" el nombre del String en:  "private String email;"
        baseDeDatos.createQuery(consultaSql)
                .setParameter("paramEmail", emailDelUsuario)
                .executeUpdate();
        return consultaSql;
    }

    @Transactional
    public String  guardarEmail_SQL_Native(String emailDelUsuario) { // COSNSULTA DIRECTA SQL, vulnerable a ataque de inyeccion
    //public String  guardarEmail(String emailDelUsuario) {
        String consultaSql= "INSERT INTO `lead` (`id`, `email`) " +
               "VALUES (NULL, '" + emailDelUsuario + "')";
        baseDeDatos.createNativeQuery(consultaSql).executeUpdate();  // aqui se ejecuta: SQL

        return consultaSql;

    }

    @Transactional
    public void eliminarEmail(String emailDelUsuario) {
        String consultaSql = "DELETE FROM Lead WHERE email = :paramEmail";
        baseDeDatos.createQuery(consultaSql)
                .setParameter("paramEmail", emailDelUsuario)
                .executeUpdate();
    }


    @Transactional(readOnly = true)
    public List<Lead> listarEmails() {
        String consultaSql = "SELECT ld FROM Lead ld ORDER BY ld.email";
        return baseDeDatos.createQuery(consultaSql, Lead.class).getResultList();
    }
}
