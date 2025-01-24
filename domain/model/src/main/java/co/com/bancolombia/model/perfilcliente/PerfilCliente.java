package co.com.bancolombia.model.perfilcliente;
import lombok.*;
//import lombok.NoArgsConstructor;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class PerfilCliente {
    private String id;
    private String tipoIdentificacion;
    private String numeroIdentificacion;
    private String nombres;
    private String apellidos;
    private String fechaNacimiento;
    private String genero;
    private String estadoCivil;
    private String fechanacimiento;
    private String direccion;
    private String telefono;
    private String email;
    private String nivelEstudio;
    private String profesion;
    private String ocupacion;
    private String ingresos;
    private String egresos;
    private String patrimonio;
    private String fechaCreacion;
    private String fechaModificacion;
}
