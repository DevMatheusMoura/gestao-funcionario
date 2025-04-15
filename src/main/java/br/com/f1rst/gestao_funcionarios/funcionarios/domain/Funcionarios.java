package br.com.f1rst.gestao_funcionarios.funcionarios.domain;

import br.com.f1rst.gestao_funcionarios.funcionarios.application.api.FuncionariosRequest;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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
    private UUID idFuncionarios;
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



    public Funcionarios(FuncionariosRequest funcionariosRequest) {
        this.nomeCompleto = funcionariosRequest.getNomeCompleto();
        this.funcao = funcionariosRequest.getFuncao();
        this.salario = funcionariosRequest.getSalario();
        this.telefone = funcionariosRequest.getTelefone();
        this.endereco = funcionariosRequest.getEndereco();
    }
}
