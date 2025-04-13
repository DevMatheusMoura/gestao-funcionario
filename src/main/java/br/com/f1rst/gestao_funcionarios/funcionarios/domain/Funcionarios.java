package br.com.f1rst.gestao_funcionarios.funcionarios.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor
@Getter
@Entity
public class Funcionarios {
    @Id
    private UUID idFuncionario;
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

    public Funcionarios(String nomeCompleto, String funcao, Double salario, String telefone, String endereço) {
        this.idFuncionario = UUID.randomUUID();
        this.nomeCompleto = nomeCompleto;
        this.funcao = funcao;
        this.salario = salario;
        this.telefone = telefone;
        this.endereço = endereço;
    }
}
