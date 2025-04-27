package br.com.f1rst.gestao_funcionarios.funcionarios.application.service;

import br.com.f1rst.gestao_funcionarios.funcionarios.application.api.FuncionarioDetalhadoResponse;
import br.com.f1rst.gestao_funcionarios.funcionarios.application.api.FuncionariosListResponse;
import br.com.f1rst.gestao_funcionarios.funcionarios.application.api.FuncionariosRequest;
import br.com.f1rst.gestao_funcionarios.funcionarios.application.api.FuncionariosResponse;
import br.com.f1rst.gestao_funcionarios.funcionarios.domain.Funcionarios;

import java.util.List;
import java.util.UUID;

public interface FuncionariosService {
    FuncionariosResponse criaFuncionarios(FuncionariosRequest funcionariosRequest);
    List<FuncionariosListResponse> buscaTodosFuncionario();
    void editaFuncionario(UUID idFuncionario, FuncionariosRequest funcionariosRequest);
    FuncionarioDetalhadoResponse buscaFuncionario(UUID idFuncionario);
    void deletaFuncionario(UUID idFuncionario);
}