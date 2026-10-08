package com.biblioteca.app.controller;

import com.biblioteca.app.model.Livro;
import com.biblioteca.app.service.LivroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Indica que esta classe recebe chamadas HTTP
@RestController
@RequestMapping("/api/livros")
public class LivroController {

    @Autowired
    private LivroService livroService;

    // POST /api/livros
    // Cadastrar livro
    @PostMapping
    public Livro cadastrarLivro(@RequestBody Livro livro) {
        return livroService.cadastrarLivro(livro);
    }

    // GET /api/livros
    // Listar livros
    @GetMapping
    public List<Livro> listarLivros() {
        return livroService.listarLivros();
    }

    // PUT /api/livros/{id}/emprestar
    // Realizar empréstimo
    @PutMapping("/{id}/emprestar")
    public Livro realizarEmprestimo(@PathVariable Integer id) {
        return livroService.realizarEmprestimo(id);
    }

    // PUT /api/livros/{id}/devolver
    // Realizar devolução
    @PutMapping("/{id}/devolver")
    public Livro realizarDevolucao(@PathVariable Integer id) {
        return livroService.realizarDevolucao(id);
    }
}