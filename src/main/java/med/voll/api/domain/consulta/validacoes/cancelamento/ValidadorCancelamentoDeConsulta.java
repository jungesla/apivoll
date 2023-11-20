package med.voll.api.domain.consulta.validacoes.cancelamento;

import med.voll.api.domain.consulta.ConsultaRepository;
import med.voll.api.domain.consulta.ValidacaoException;
import med.voll.api.domain.consulta.validacoes.DadosCancelamentoConsulta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.LocalDateTime;

public interface ValidadorCancelamentoDeConsulta {

    void validar(DadosCancelamentoConsulta dados);



}