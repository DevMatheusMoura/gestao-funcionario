package br.com.f1rst.gestao_funcionarios.funcionarios.domain;

import br.com.f1rst.gestao_funcionarios.funcionarios.application.api.FuncionariosRequest;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
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
    @NotBlank(message = "Nome completo é obrigatório")
    private String nomeCompleto;
    @NotBlank(message = "Função é obrigatória")
    private String funcao;
    @NotNull(message = "Salário é obrigatório")
    private Double salario;
    @NotBlank(message = "Telefone é obrigatório")
    private String telefone;
    @NotBlank(message = "Endereço é obrigatório")
    private String endereco;



    public Funcionarios(FuncionariosRequest funcionariosRequest) {
        this.nomeCompleto = funcionariosRequest.getNomeCompleto();
        this.funcao = funcionariosRequest.getFuncao();
        this.salario = funcionariosRequest.getSalario();
        this.telefone = funcionariosRequest.getTelefone();
        this.endereco = funcionariosRequest.getEndereco();
    }

    public void atualiza(FuncionariosRequest funcionariosRequest) {
        this.nomeCompleto = funcionariosRequest.getNomeCompleto();
        this.funcao = funcionariosRequest.getFuncao();
        this.salario = funcionariosRequest.getSalario();
        this.telefone = funcionariosRequest.getTelefone();
        this.endereco = funcionariosRequest.getEndereco();
    }
}
