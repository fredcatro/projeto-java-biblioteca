package com.biblioteca.app.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;

@Entity //leva essa classe para o banco de dados
@Table(name = "tb_usuario")//nome da tabela no banco de dados

public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer matricula;
    private String nome;

    //Construtor vazio obrigatorio para o Jpa
    public Usuario(){
    }
    public Usuario(Integer matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }
    public Integer getMatricula() {
        return matricula;
    }
    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
