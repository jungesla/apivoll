package med.voll.api.domain.paciente;

public record DadosAtualizacaoPaciente(
        Long id,
        String nome,
        String email,
        String cpf,
        String telefone

) {
}