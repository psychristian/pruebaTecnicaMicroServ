package com.PruebaTec.prueba.dao;
import com.PruebaTec.prueba.models.Clientes;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class ClienteDaoImp implements ClienteDao{
    @PersistenceContext
    EntityManager entityManager;
    @Override
    public List<Clientes> getClientes() {
        String query ="FROM Clientes";
        List<Clientes> resultado=entityManager.createQuery(query).getResultList();
        return resultado;
    }
    @Override
    public void eliminarCliente(Long id) {
        Clientes cli=entityManager.find(Clientes.class, id);
        entityManager.remove(cli);
    }

    @Override
    public void agregarCliente(Clientes cli) {
        entityManager.merge(cli);
    }

 /*
    @Override
    public void actualizarCliente(Long id, Clientes cli) {
        Clientes cliX=entityManager.find(Clientes.class, id);
        cliX.setNombre1(cli.getNombre1());
        cliX.setNombre2(cli.getNombre2());
        cliX.setApellido1(cli.getApellido1());
        cliX.setApellido2(cli.getApellido2());
        entityManager.merge(cliX);
    }

    @Override
    public Clientes buscarCliente(Long id) {
        List<Clientes> resultado = new List<Clientes>;
        Clientes cli=entityManager.find(Clientes.class, id);
        //resultado=entityManager.createQuery(query).getResultList();
        return cli;
    }
*/
}


//////////////////////////////////////////////////////
    /*

    @Override
    public boolean verificarCredenciales(Usuario usuario) {
        String query = "FROM Usuario WHERE email = :email AND password = :psw";
        List<Usuario> lista = entityManager.createQuery(query)
                .setParameter("email",usuario.getEmail())
                .setParameter("psw",usuario.getPassword())
                .getResultList();
        if (lista.isEmpty()){
            return false;
        }
        else{
            return true;
        }

     */