package br.com.f1rst.gestao_funcionarios.funcionarios.application.api;


import br.com.f1rst.gestao_funcionarios.funcionarios.domain.Funcionarios;
import lombok.Value;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Value
public class FuncionariosListResponse {

    private UUID idFuncionarios;
    private String nomeCompleto;
    private String funcao;

    public static List<FuncionariosListResponse> converte(List<Funcionarios> funcionario) {
        return funcionario.stream()
                .map(FuncionariosListResponse::new)
                .collect(Collectors.toList());
    }

    public FuncionariosListResponse(Funcionarios funcionarios) {
        this.idFuncionarios = funcionarios.getIdFuncionarios();
        this.nomeCompleto = funcionarios.getNomeCompleto();
        this.funcao = funcionarios.getFuncao();
    }
}

