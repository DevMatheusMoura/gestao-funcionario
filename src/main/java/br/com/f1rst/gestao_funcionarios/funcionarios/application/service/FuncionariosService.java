package br.com.f1rst.gestao_funcionarios.funcionarios.application.service;

import br.com.f1rst.gestao_funcionarios.funcionarios.application.api.FuncionariosListResponse;
import br.com.f1rst.gestao_funcionarios.funcionarios.application.api.FuncionariosRequest;
import br.com.f1rst.gestao_funcionarios.funcionarios.application.api.FuncionariosResponse;

import java.util.List;

public interface FuncionariosService {
    FuncionariosResponse criaFuncionarios(FuncionariosRequest funcionariosRequest);
    List<FuncionariosListResponse> buscaTodosFuncionario();
}