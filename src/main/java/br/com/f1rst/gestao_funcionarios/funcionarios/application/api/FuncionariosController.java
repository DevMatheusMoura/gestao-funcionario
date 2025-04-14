package br.com.f1rst.gestao_funcionarios.funcionarios.application.api;

import br.com.f1rst.gestao_funcionarios.funcionarios.application.service.FuncionariosService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@RequiredArgsConstructor
public class FuncionariosController implements FuncionariosAPI {
    private final FuncionariosService funcionariosService;


    @Override
    public FuncionariosResponse postFuncionarios(FuncionariosRequest funcionariosRequest) {
       log.info("[inicia] FuncionariosController - postFuncionarios");
       FuncionariosResponse funcionariosCriado = funcionariosService.criaFuncionarios(funcionariosRequest);
        log.info("[finaliza] FuncionariosController - postFuncionarios");
        return funcionariosCriado;

}
