package service;

import model.Livro;
import model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;
    private List<Usuario> usuarios;

    public Biblioteca() {
        this.livros = new ArrayList<>();//aloca o objeto da lista de livros na memoria e fica pronta para receber novo livros
        this.usuarios = new ArrayList<>();//aloca o objeto da lista de usuarios na memoria e fica pronto para recber novos usuarios
    }

    public void cadastrarLivro(Livro livro){
        this.livros.add(livro);
        System.out.println("Livro cadastrado com sucesso: " + livro.getTitulo());
    }

    public void cadastrarUsuario(Usuario usuario){
        this.usuarios.add(usuario);
        System.out.println("Usuario cadastrado com sucesso: " + usuario.getNome());
    }

    public void listaLivros(){
        if(this.livros.isEmpty()){//verifica se a lista de livros esta vazia
            System.out.println("Não ha livros cadastrados");//caso esteja retorna essa mensagem
            return;
        }
        System.out.println("---LISTA DE LIVROS---");
        for(Livro livro: this.livros){//
            System.out.println(livro);
        }
    }
    public void listaUsuarios(){
        if(this.usuarios.isEmpty()){
            System.out.println("Nenhum usuario cadastrado com sucesso");
            return;
        }
        System.out.println("---LISTA DE USUARIOS---");
        for(Usuario usuario : this.usuarios){
            System.out.println(usuario);
        }
    }
    public Livro buscarLivroPorId(int id){
        for(Livro l : this.livros){
            if(l.getId() == id) {
                return l;
            }
        }
        return null;
    }
    public boolean emprestarLivro(int idLivro){
        Livro livro =  buscarLivroPorId(idLivro);
        if(livro == null){
            System.out.println("O livro nao foi encontrado");
            return false;
        }
        else if(livro.isDisponivel() == false){
            System.out.println("Encontrado, porem, emprestado");
            return false;
        }
        livro.setDisponivel(false);
        System.out.println("Emprestado com sucesso");
        return true;
    }
    public boolean devolverLivro(int idLivro){
        Livro livro =  buscarLivroPorId(idLivro);
          if(livro == null){
              System.out.println("O livro nao pertence ao sistema");
              return false;
          }
          if(livro.isDisponivel()){
              System.out.println("Este livro já constava como disponivel na biblioteca");
              return false;
          }
          livro.setDisponivel(true);
          System.out.println("Devolvido com sucesso");
          return true;
    }
}