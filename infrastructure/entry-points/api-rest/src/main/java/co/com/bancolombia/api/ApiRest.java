package co.com.bancolombia.api;
import co.com.bancolombia.model.cliente.Cliente;
import co.com.bancolombia.model.perfilcliente.PerfilCliente;
import co.com.bancolombia.usecase.simulador.SimuladorUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * API Rest controller.
 * 
 * Example of how to declare and use a use case:
 * <pre>
 * private final MyUseCase useCase;
 * 
 * public String commandName() {
 *     return useCase.execute();
 * }
 * </pre>
 */
@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ApiRest {

    private final SimuladorUseCase simuladorUseCase;


    @PostMapping(path = "/llamado")
    public ResponseEntity<PerfilCliente> llamado(@RequestBody Cliente cliente) throws IOException {
    //json(tipo y numero de documento) tipo String,

        PerfilCliente p = simuladorUseCase.getCliente(cliente);

        return new ResponseEntity<>(p, HttpStatus.OK);
    }




}
