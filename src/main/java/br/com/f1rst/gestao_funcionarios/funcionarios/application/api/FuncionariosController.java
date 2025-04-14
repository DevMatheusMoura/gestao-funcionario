package br.com.f1rst.gestao_funcionarios.funcionarios.application.api;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class FuncionariosController implements FuncionariosAPI {

    @Override
    public FuncionariosResponse postFuncionarios(FuncionariosRequest funcionariosRequest) {
       log.info("[inicia] FuncionariosController - postFuncionarios");
        log.info("[finaliza] FuncionariosController - postFuncionarios");
        return null;
    }

}
