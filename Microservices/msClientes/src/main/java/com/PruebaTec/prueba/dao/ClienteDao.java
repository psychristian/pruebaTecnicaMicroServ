package com.PruebaTec.prueba.dao;
import com.PruebaTec.prueba.models.Clientes;
import java.util.List;

public interface ClienteDao {
    List<Clientes> getClientes();
    // Clientes buscarCliente(Long id);
    void eliminarCliente(Long id);
    void agregarCliente(Clientes cli);

//    void actualizarCliente(Long id, Clientes cli);

//  boolean verificarCredenciales(Usuario usuario);
}
