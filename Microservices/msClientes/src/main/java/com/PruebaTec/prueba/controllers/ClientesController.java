package com.PruebaTec.prueba.controllers;
import com.PruebaTec.prueba.dao.ClienteDao;
import com.PruebaTec.prueba.models.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class ClientesController {
    @Autowired
    private ClienteDao cliDao;

    // Listar Clientes
    @RequestMapping (value = "api/clientes", method = RequestMethod.GET)
    public List<Clientes> getClientes() {
        return cliDao.getClientes();
    }

    // Eliminar Clientes
    @RequestMapping (value = "api/clientes/{id}", method = RequestMethod.DELETE)
    public void eliminarCliente(@PathVariable Long id) {
        cliDao.eliminarCliente(id);
    }

    // Agregar Clientes
    @RequestMapping (value = "api/clientes", method = RequestMethod.POST)
    public void agregarCliente(@RequestBody Clientes cli) {
        cliDao.agregarCliente(cli);
    }
/*
    // Actualizar Clientes
    @RequestMapping (value = "api/clientes", method = RequestMethod.POST)
    public void actualizarCliente(@PathVariable Long id, @RequestBody Clientes cli) {
        cliDao.actualizarCliente(id, cli);
    }

    // Buscar Cliente
    @GetMapping ("api/clientes/{id}")
    public Clientes obtenerClientePorId(@PathVariable Long id) {
        Clientes cli = cliDao.buscarCliente(id);
        return cli;
    }
    */

}


//////////////////////////////////////////////////////////

/*
    @RequestMapping (value = "api/usuario/{id}", method = RequestMethod.GET)
    public Usuario getUsuario(@PathVariable long id) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Lucas");
        usuario.setApellido("Moy");
        usuario.setEmail("nada@gmail.com");
        usuario.setTelefono("3013945547");
        return usuario;
    } */
/*
*/