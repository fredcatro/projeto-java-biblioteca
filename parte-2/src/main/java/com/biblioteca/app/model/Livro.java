package com.biblioteca.app.model;


import jakarta.persistence.*;

@Entity
@Table(name = "tb_livro")
public class Livro {

    @Id//marca o atributo da classe como a chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)//informa ao banco de dados que a cada novo livro deve gerar um id automatico
    private Integer id;

    private String titulo;
    private String autor;
    private boolean disponivel;

    public Livro(){

    }
    public Livro(Integer id, String titulo, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public boolean isDisponivel() {
        return disponivel;
    }
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
