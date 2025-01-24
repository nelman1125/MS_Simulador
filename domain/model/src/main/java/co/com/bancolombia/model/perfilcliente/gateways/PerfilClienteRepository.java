package co.com.bancolombia.model.perfilcliente.gateways;

import co.com.bancolombia.model.cliente.Cliente;
import co.com.bancolombia.model.perfilcliente.PerfilCliente;

import java.io.IOException;

public interface PerfilClienteRepository {

    PerfilCliente getCliente(Cliente cliente) throws IOException;

}
