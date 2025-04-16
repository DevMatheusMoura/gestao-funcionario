package br.com.f1rst.gestao_funcionarios.funcionarios.application.api;

import br.com.f1rst.gestao_funcionarios.funcionarios.application.service.FuncionariosService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
    public List<FuncionariosListResponse> getTodosFuncionarios() {
        log.info("[inicia] FuncionariosController - getTodosFuncionarios");
        List<FuncionariosListResponse> Funcionario = funcionariosService.buscaTodosFuncionario();
        log.info("[finaliza] FuncionariosController - getTodosFuncionarios");
        return Funcionario;
    }
}