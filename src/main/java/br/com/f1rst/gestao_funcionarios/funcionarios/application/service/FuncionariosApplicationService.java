package br.com.f1rst.gestao_funcionarios.funcionarios.application.service;

import br.com.f1rst.gestao_funcionarios.funcionarios.application.api.FuncionariosRequest;
import br.com.f1rst.gestao_funcionarios.funcionarios.application.api.FuncionariosResponse;
import br.com.f1rst.gestao_funcionarios.funcionarios.application.repository.FuncionariosRepository;
import br.com.f1rst.gestao_funcionarios.funcionarios.domain.Funcionarios;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class FuncionariosApplicationService implements FuncionariosService {
    private final FuncionariosRepository funcionariosRepository;

    @Override
    public FuncionariosResponse criaFuncionarios(FuncionariosRequest funcionariosRequest) {
        log.info("[inicia] FuncionariosApplicationService - criaFuncionarios");
        Funcionarios funcionarios = funcionariosRepository.salva(new Funcionarios(funcionariosRequest));
        log.info("[finaliza] FuncionariosApplicationService - criaFuncionarios");
        return FuncionariosResponse.builder()
                .idFuncionarios(funcionarios.getIdFuncionarios())
                .build();
    }
}