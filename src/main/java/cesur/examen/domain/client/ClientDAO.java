package cesur.examen.domain.client;

import cesur.examen.common.DAO;
import cesur.examen.common.HibernateUtil;
import lombok.extern.java.Log;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

/**
 * EXAMEN DE ACCESO A DATOS
 * Diciembre 2023
 *
 * Nombre del alumno: Rafael Delgado Shepherd
 * Fecha: 11/12/2023
 */

@Log
public class ClientDAO implements DAO<Client> {
    @Override
    public Client save(Client client) {
        return null;
    }

    @Override
    public Client update(Client client) {
        return null;
    }

    @Override
    public boolean remove(Client client) {
        return false;
    }

    @Override
    public Client get(Long id) {
        return null;
    }


    @Override
    public List<Client> getAll() {
       //Creo una lista Cliente para almacenar los coches
        List<Client> result = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            //Creo una consulta Query para obtener los objetos Client
            Query<Client> query = session.createQuery("from Client", Client.class);
            //LLevo a cabo la consulta y asigno los resultados a la tabla salida
            result = query.getResultList();
        }
       return result;
    }

}
