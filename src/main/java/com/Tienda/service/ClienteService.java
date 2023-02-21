
package com.Tienda.service;

import com.Tienda.domain.Cliente;
import java.util.List;

/**
 *
 * @author mariafernandamiranda
 */
public interface ClienteService {
    
    public List<Cliente> getClientes();
    
    public  Cliente getCliente (Cliente cliente);
    
    public void save (Cliente cliente); // sirve para modificar y eliminar un registro
    
    public void delete (Cliente clienete);
    
    
    
}
