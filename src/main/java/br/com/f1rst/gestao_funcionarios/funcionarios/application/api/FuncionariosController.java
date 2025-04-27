package br.com.f1rst.gestao_funcionarios.funcionarios.application.api;

import br.com.f1rst.gestao_funcionarios.funcionarios.application.service.FuncionariosService;
import br.com.f1rst.gestao_funcionarios.funcionarios.domain.Funcionarios;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@Log4j2
@RequiredArgsConstructor
public class FuncionariosController implements FuncionariosAPI {
    private final FuncionariosService funcionariosService;


    @Override
    public FuncionariosResponse postFuncionarios(@Valid FuncionariosRequest funcionariosRequest) {
       log.info("[inicia] FuncionariosController - postFuncionarios");
       FuncionariosResponse funcionariosCriado = funcionariosService.criaFuncionarios(funcionariosRequest);
        log.info("[finaliza] FuncionariosController - postFuncionarios");
        return funcionariosCriado;
    }


    @Override
    public List<FuncionariosListResponse> getTodosFuncionario() {
        log.info("[inicia] FuncionariosController - getTodosFuncionario");
        List<FuncionariosListResponse> funcionario = funcionariosService.buscaTodosFuncionario();
        log.info("[finaliza] FuncionariosController - getTodosFuncionario");
        return funcionario;


    }

    @Override
    public void editaFuncionario(UUID idFuncionario, FuncionariosRequest funcionariosRequest) {
        log.info("[inicia] FuncionariosController - editaFuncionario");
        funcionariosService.editaFuncionario(idFuncionario, funcionariosRequest);
        log.info("[finaliza] FuncionariosController - editaFuncionario");

    }

    @Override
    public FuncionarioDetalhadoResponse getFuncionario(UUID idFuncionario) {
        log.info("[inicia] FuncionariosController - getFuncionarios");
        FuncionarioDetalhadoResponse funcionario = funcionariosService.buscaFuncionario(idFuncionario);
        log.info("[finaliza] FuncionariosController - getFuncionarios");
        return funcionario;
    }

    @Override
    public void deletaFuncionario(UUID idFuncionario) {
        log.info("[inicia] FuncionariosController - deletaFuncionario");
        funcionariosService.deletaFuncionario(idFuncionario);
        log.info("[finaliza] FuncionariosController - deletaFuncionario");
    }
}