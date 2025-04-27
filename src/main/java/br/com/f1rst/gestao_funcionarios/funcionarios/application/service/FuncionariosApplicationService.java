package br.com.f1rst.gestao_funcionarios.funcionarios.application.service;

import br.com.f1rst.gestao_funcionarios.funcionarios.application.api.FuncionarioDetalhadoResponse;
import br.com.f1rst.gestao_funcionarios.funcionarios.application.api.FuncionariosListResponse;
import br.com.f1rst.gestao_funcionarios.funcionarios.application.api.FuncionariosRequest;
import br.com.f1rst.gestao_funcionarios.funcionarios.application.api.FuncionariosResponse;
import br.com.f1rst.gestao_funcionarios.funcionarios.application.repository.FuncionariosRepository;
import br.com.f1rst.gestao_funcionarios.funcionarios.domain.Funcionarios;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

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

    @Override
    public List<FuncionariosListResponse> buscaTodosFuncionario() {
        log.info("[inicia] FuncionariosApplicationService - buscaTodosFuncionario");
        List<Funcionarios> funcionario = funcionariosRepository.buscaTodosFuncionario();
        log.info("[finaliza] FuncionariosApplicationService - buscaTodosFuncionario");
        return FuncionariosListResponse.converte(funcionario);
    }

    @Override
    public void editaFuncionario(UUID idFuncionario, FuncionariosRequest funcionariosRequest) {
        log.info("[inicia] FuncionariosApplicationService - editaFuncionario");
        Funcionarios funcionarios = funcionariosRepository.buscaFuncionario(idFuncionario);
        funcionarios.atualiza(funcionariosRequest);
        funcionariosRepository.salva(funcionarios);
        log.info("[finaliza] FuncionariosApplicationService - editaFuncionario");
    }

    @Override
    public FuncionarioDetalhadoResponse buscaFuncionario(UUID idFuncionario) {
        log.info("[inicia] FuncionariosApplicationService - buscaFuncionario");
        Funcionarios funcionario = funcionariosRepository.buscaFuncionario(idFuncionario);
        log.info("[Finaliza] FuncionariosApplicationService - buscaFuncionario");
        return new FuncionarioDetalhadoResponse(funcionario);
    }

    @Override
    public void deletaFuncionario(UUID idFuncionario) {
        log.info("[inicia] FuncionariosApplicationService - deletaFuncionario");
        Funcionarios funcionario = funcionariosRepository.buscaFuncionario(idFuncionario);
        funcionariosRepository.deleta(funcionario);
        log.info("[finaliza] FuncionariosApplicationService - deletaFuncionario");
    }


}
