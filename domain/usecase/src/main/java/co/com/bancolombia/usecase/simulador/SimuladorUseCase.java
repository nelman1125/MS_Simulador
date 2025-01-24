package co.com.bancolombia.usecase.simulador;

import co.com.bancolombia.model.cliente.Cliente;
import co.com.bancolombia.model.perfilcliente.PerfilCliente;
import co.com.bancolombia.model.perfilcliente.gateways.PerfilClienteRepository;
import lombok.RequiredArgsConstructor;

import java.io.IOException;

@RequiredArgsConstructor
public class SimuladorUseCase {
    private final PerfilClienteRepository perfilClienteRepository;

    public PerfilCliente getCliente(Cliente cliente) throws IOException {
        return perfilClienteRepository.getCliente(cliente);
    }



}
