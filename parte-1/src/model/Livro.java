package model;

public class Livro {
    private int id;
    private String titulo;
    private String autor;
    private boolean disponivel;

    //metodo construtor

    public Livro(int id, String titulo, String autor){
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }

    //metodos

    public int getId(){
        return id;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    //retorna o valor verdadeiro ou falso de acordo com a variavel inicializada boolean
    public boolean isDisponivel(){
        return disponivel;
    }
    //metodo set serve para atualizar o valor da variavel boolean disponivel de acordo com o status do livro

    public void setDisponivel(boolean status){
        this.disponivel = status;
    }
    public void emprestar(){
        this.disponivel = false;
    }
    public void devolver(){
        this.disponivel = true;
    }
    public void exibirInfo(){
        System.out.println("ID: " + this.id + " | Titulo: " + this.titulo + " | Autor: " + this.autor + " | Disponibilidade" + this.disponivel);
    }

}
