package br.com.f1rst.gestao_funcionarios.funcionarios.application.api;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

@Value
public class FuncionariosRequest {

    @NotBlank
    private String nomeCompleto;
    @NotBlank
    private String funcao;
    @NotNull
    private Double salario;
    @NotBlank
    private String telefone;
    @NotBlank
    private String endereço;
}
