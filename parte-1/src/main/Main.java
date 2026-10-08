package main;
import model.Livro;
import model.Usuario;
import service.Biblioteca;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner sc = new Scanner(System.in);

        int opcao = -1;//para sinalizar que nenhuma opçao foi escolhida

        while(opcao != 0){
            System.out.println("\n--- MENU BIBLIOTECA ---");
            System.out.println("1- Cadastrar Livro");
            System.out.println("2- Cadastrar Usuario");
            System.out.println("3- Listar Livros");
            System.out.println("4- Realizar Emprestimo");
            System.out.println("5- Realizar Devolução");
            System.out.println("0- Sair");
            opcao = sc.nextInt();

            switch(opcao){

                case 1:
                    System.out.println("Digite o id do livro: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Digite o titulo do livro: ");
                    String titulo = sc.nextLine();


                    System.out.println("Digite o autor do livro: ");
                    String autor = sc.nextLine();

                    Livro livro = new Livro(id, titulo, autor);
                    biblioteca.cadastrarLivro(livro);
                    break;//Encerra o caso 1 e volta para o menu

                case 2:
                    System.out.println("Digite a matricula do usuario: ");
                    int matricula = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Digite o nome do usuario: ");
                    String nome = sc.nextLine();

                    Usuario usuario = new Usuario(matricula, nome);

                    biblioteca.cadastrarUsuario(usuario);
                    break;

                case 3:
                    biblioteca.listaLivros();
                    break;

                case 4:
                    System.out.println("Digite o id do livro para emprestimo: ");
                    int idEmprestimo = sc.nextInt();
                    biblioteca.emprestarLivro(idEmprestimo);
                    break;

                case 5:
                    System.out.println("Digite o id do livro para devoluçao");
                    int idDevoluao = sc.nextInt();
                    biblioteca.devolverLivro(idDevoluao);
                    break;

                case 0:
                    System.out.println("Saindo do sistema.");
                    sc.close();
                    break;


                default:
                    System.out.println("Opção inválida! Digite um número entre 0 e 5.");
                    break;

            }
        }
    }
}
