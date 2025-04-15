package br.com.f1rst.gestao_funcionarios.funcionarios.infra;

import br.com.f1rst.gestao_funcionarios.funcionarios.application.repository.FuncionariosRepository;
import br.com.f1rst.gestao_funcionarios.funcionarios.domain.Funcionarios;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@Log4j2
@RequiredArgsConstructor
public class FuncionariosInfraRepository implements FuncionariosRepository {
    private final FuncionariosSprintDataJPARepository funcionariosSprintDataJPARepository;
    @Override
    public Funcionarios salva(Funcionarios funcionarios) {
        log.info("[inicia] FuncionariosInfraRepository - salva");
        funcionariosSprintDataJPARepository.save(funcionarios);
        log.info("[finaliza] FuncionariosInfraRepository - salva");
        return funcionarios;
    }
}

