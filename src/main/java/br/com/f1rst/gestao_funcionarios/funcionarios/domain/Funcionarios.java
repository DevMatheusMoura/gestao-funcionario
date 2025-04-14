package br.com.f1rst.gestao_funcionarios.funcionarios.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor
@Getter
@Entity
public class Funcionarios {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    @Column(name = "id_funcionario", updatable = false, unique = true,nullable = false)
    private UUID idFuncionario;
    @NotBlank
    private String nomeCompleto;
    @NotBlank
    private String funcao;
    @NotNull
    private Double salario;
    @NotBlank
    @Size(min = 11, max = 15)
    private String telefone;
    @NotBlank
    private String endereco;

    public Funcionarios(String nomeCompleto, String funcao, Double salario, String telefone, String endereco) {
        this.nomeCompleto = nomeCompleto;
        this.funcao = funcao;
        this.salario = salario;
        this.telefone = telefone;
        this.endereco = endereco;
    }
}
