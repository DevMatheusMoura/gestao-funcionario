package br.com.f1rst.gestao_funcionarios.funcionarios.application.api;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Value;

@Value
public class FuncionariosRequest {
    @NotBlank(message = "Nome completo é obrigatório")
    private String nomeCompleto;
    @NotBlank(message = "Função é obrigatória")
    private String funcao;
    @NotNull(message = "Salário é obrigatório")
    private Double salario;
    @NotBlank(message = "Telefone é obrigatório")
    @Size(min = 11, max = 15)
    private String telefone;
    @NotBlank(message = "Endereço é obrigatório")
    private String endereco;
}
