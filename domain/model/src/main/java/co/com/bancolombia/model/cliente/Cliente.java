package co.com.bancolombia.model.cliente;
import lombok.*;
//import lombok.NoArgsConstructor;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Cliente {
    private String id;
    private TipoDocumento tipoDocumento;
    private String numeroDocumento;

    enum TipoDocumento {
        CC, CE, TI, NIT
    }


}
