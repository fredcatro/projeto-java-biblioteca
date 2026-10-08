package model;

public class Usuario {
    //Representa os leitores cadastrados no sistema

    private int matricula;
    private String nome;

    //metodo construtor

    public Usuario(int matricula, String nome){
        this.matricula = matricula;
        this.nome = nome;
    }

    public int getmatricula(){
        return matricula;
    }
    public String getNome(){
        return nome;
    }
    public void exibirInfo(){
        System.out.println(" | Matricula: " + matricula + " | Nome: " + nome);
    }
}
