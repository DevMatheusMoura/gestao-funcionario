package br.com.f1rst.gestao_funcionarios.funcionarios.application.repository;

import br.com.f1rst.gestao_funcionarios.funcionarios.application.api.FuncionariosListResponse;
import br.com.f1rst.gestao_funcionarios.funcionarios.domain.Funcionarios;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FuncionariosRepository {

    Funcionarios salva(Funcionarios funcionarios);

    static List<Funcionarios> buscaTodosFuncionario() {
        return null;
    }
}
