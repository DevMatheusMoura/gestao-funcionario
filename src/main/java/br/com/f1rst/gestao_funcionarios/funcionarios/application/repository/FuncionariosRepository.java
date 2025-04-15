package br.com.f1rst.gestao_funcionarios.funcionarios.application.repository;

import br.com.f1rst.gestao_funcionarios.funcionarios.domain.Funcionarios;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionariosRepository {
    Funcionarios salva(Funcionarios funcionarios);
}
