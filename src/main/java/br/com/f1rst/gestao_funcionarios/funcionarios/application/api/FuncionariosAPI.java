package br.com.f1rst.gestao_funcionarios.funcionarios.application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/funcionarios")
public interface FuncionariosAPI {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    FuncionariosResponse postFuncionarios(@Valid @RequestBody FuncionariosRequest funcionariosRequest);

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<FuncionariosListResponse> getTodosFuncionarios();
}