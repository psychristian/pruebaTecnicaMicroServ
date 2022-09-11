package com.PruebaTec.prueba.controllers;
import com.PruebaTec.prueba.dao.ClienteDao;
import com.PruebaTec.prueba.models.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
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

    @RequestMapping (value = "api/clientes", method = RequestMethod.POST)
    public void agregarCliente(@RequestBody Clientes cli) {
        cliDao.agregarCliente(cli);
    }


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