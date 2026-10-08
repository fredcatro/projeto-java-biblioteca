package com.biblioteca.app.repository;

import com.biblioteca.app.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // indica ao spring que este componente e responsavel pela camada
//de persistencia e comunicação direte com o banco de dados

public interface LivroRepository extends JpaRepository<Livro, Integer> {

}
