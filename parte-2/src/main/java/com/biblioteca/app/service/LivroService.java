package com.biblioteca.app.service;

import com.biblioteca.app.model.Livro;
import com.biblioteca.app.repository.LivroRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

// Indica que esta classe é um componente de serviço
// gerenciado pelo Spring
@Service
public class LivroService {

    private LivroRepository livroRepository;

    @Autowired
    public LivroService(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    // Cadastrar livro
    @Transactional
    public Livro cadastrarLivro(Livro livro) {

        // Ao cadastrar, o livro fica disponível
        livro.setDisponivel(true);

        return livroRepository.save(livro);
    }

    // Listar todos os livros
    public List<Livro> listarLivros() {
        return livroRepository.findAll();
    }

    // Realizar empréstimo
    @Transactional
    public Livro realizarEmprestimo(Integer id) {

        Livro livro = livroRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Livro não encontrado"));

        // Verifica se o livro está disponível
        if (!livro.isDisponivel()) {
            throw new RuntimeException("Livro já está emprestado");
        }

        // Livro deixa de estar disponível
        livro.setDisponivel(false);

        // Salva a alteração no banco
        return livroRepository.save(livro);
    }

    // Realizar devolução
    @Transactional
    public Livro realizarDevolucao(Integer id) {

        Livro livro = livroRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Livro não encontrado"));

        // Livro volta a ficar disponível
        livro.setDisponivel(true);

        // Salva a alteração no banco
        return livroRepository.save(livro);
    }
}