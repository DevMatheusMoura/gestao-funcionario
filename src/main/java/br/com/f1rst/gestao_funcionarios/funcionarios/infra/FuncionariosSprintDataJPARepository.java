package br.com.f1rst.gestao_funcionarios.funcionarios.infra;

import br.com.f1rst.gestao_funcionarios.funcionarios.domain.Funcionarios;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FuncionariosSprintDataJPARepository extends JpaRepository <Funcionarios, UUID> {
    
}
