package br.com.f1rst.gestao_funcionarios.funcionarios.infra;

import br.com.f1rst.gestao_funcionarios.Handler.APIException;
import br.com.f1rst.gestao_funcionarios.funcionarios.application.repository.FuncionariosRepository;
import br.com.f1rst.gestao_funcionarios.funcionarios.domain.Funcionarios;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

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

    public List<Funcionarios> buscaTodosFuncionario() {
        log.info("[inicia] FuncionariosInfraRepository - buscaTodosFuncionario");
        List<Funcionarios> todosFuncionario = funcionariosSprintDataJPARepository.findAll();
        log.info("[finaliza] FuncionariosInfraRepository - buscaTodosFuncionario");
        return todosFuncionario;
    }

    @Override
    public Funcionarios buscaFuncionario(UUID idFuncionario) {
        log.info("[inicia] FuncionariosInfraRepository - buscaFuncionario");
        Funcionarios funcionario = funcionariosSprintDataJPARepository.findById(idFuncionario).orElseThrow(()
                -> APIException.build(HttpStatus.NOT_FOUND, "Funcionario não encontrado"));
        log.info("[finaliza] FuncionariosInfraRepository - buscaFuncionario");
        return funcionario;
    }

    @Override
    public void deleta(Funcionarios funcionario) {
        log.info("[inicia] FuncionariosInfraRepository - deleta");
        funcionariosSprintDataJPARepository.delete(funcionario);
        log.info("[finaliza] FuncionariosInfraRepository - deleta");

    }


}


