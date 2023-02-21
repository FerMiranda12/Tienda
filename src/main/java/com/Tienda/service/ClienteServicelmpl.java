
package com.Tienda.service;

import com.Tienda.dao.ClienteDao;
import com.Tienda.domain.Cliente;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author mariafernandamiranda
 */

@Service
public class ClienteServicelmpl implements ClienteService {

    @Autowired
    ClienteDao clienteDao;
    
    @Override
    @Transactional (readOnly = true) //para solo hacer lecturas
    public List<Cliente> getClientes() {
        return (List<Cliente>) clienteDao.findAll();
    }

    @Override
    @Transactional (readOnly = true)
    public Cliente getCliente(Cliente cliente) {
        return clienteDao.findById(cliente.getIdCliente()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Cliente cliente) {
        clienteDao.save(cliente);
    }

    @Override
    @Transactional
    public void delete(Cliente clienete) {
        clienteDao.deleteById(cliente.getIdCliente());
    }
    
    
    
}
