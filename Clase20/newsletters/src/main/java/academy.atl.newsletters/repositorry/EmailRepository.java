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

        String consultaSql = "INSERT INTO Lead (email) VALUES (:paramEmail)";
        baseDeDatos.createQuery(consultaSql)
                .setParameter("paramEmail", emailDelUsuario)
                .executeUpdate();
        return consultaSql;
    }

    @Transactional
    public String  guardarEmail_SQL_Native(String emailDelUsuario) { // COSNSULTA DIRECTA SQL, vulnerable a ataque de inyeccion
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
