package br.com.f1rst.gestao_funcionarios.funcionarios.application.api;


import br.com.f1rst.gestao_funcionarios.funcionarios.domain.Funcionarios;
import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Value
public class FuncionarioDetalhadoResponse {
    private UUID idFuncionarios;
    private String nomeCompleto;
    private String funcao;
    private Double salario;
    private String telefone;
    private String endereco;

    public FuncionarioDetalhadoResponse(Funcionarios funcionario) {
        this.idFuncionarios = funcionario.getIdFuncionarios();
        this.nomeCompleto = funcionario.getNomeCompleto();
        this.funcao = funcionario.getFuncao();
        this.salario = funcionario.getSalario();
        this.telefone = funcionario.getTelefone();
        this.endereco = funcionario.getEndereco();
    }

}
