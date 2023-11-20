package med.voll.api.domain.consulta.validacoes;

import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.consulta.MotivoCancelamento;

public record DadosCancelamentoConsulta(
        @NotNull
        Long idConsulta,

        @NotNull
        MotivoCancelamento motivo) {
}
