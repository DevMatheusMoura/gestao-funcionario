package br.com.f1rst.gestao_funcionarios.funcionarios.application.api;


import br.com.f1rst.gestao_funcionarios.funcionarios.domain.Funcionarios;

import java.util.List;
import java.util.UUID;

public class FuncionariosListResponse {

    private UUID idFuncionarios;
    private String nomeCompleto;
    private String funcao;

    public static List<FuncionariosListResponse> converte(List<Funcionarios> funcionario) {
        return null;
    }
}
