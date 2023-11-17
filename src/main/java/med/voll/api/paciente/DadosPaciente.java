package med.voll.api.paciente;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosPaciente(

    @NotBlank
    String nome,
    @NotBlank
    String email,
    @NotBlank
    @Pattern(regexp = "\\d{11}")
    String cpf){

}
