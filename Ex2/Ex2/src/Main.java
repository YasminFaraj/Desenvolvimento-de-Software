import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Livro> biblioteca = new ArrayList<>();

        int opcao;

        do {
            System.out.println("Bem-vindo à sua biblioteca!");
            System.out.println("Informe qual opção você deseja:");
            System.out.println("1. Adicionar um livro.");
            System.out.println("2. Ver coleção de livros.");
            System.out.println("3. Sair.");
            opcao = Integer.parseInt(leitor.nextLine());

            switch (opcao) {
                case 1:
                    System.out.println("Adicionar um livro:");
                    System.out.print("Título: ");
                    String titulo = leitor.nextLine();

                    System.out.print("Autor: ");
                    String autor = leitor.nextLine();

                    System.out.print("Ano: ");
                    int ano = Integer.parseInt(leitor.nextLine());

                    biblioteca.add(new Livro(titulo, autor, ano));
                    break;

                case 2:
                    System.out.println("Sua biblioteca:");
                    for (int i = 0; i < biblioteca.size(); i++) {
                        Livro livro = biblioteca.get(i);
                        livro.exibir_info();
                        System.out.println("");
                    }

                    break;

                case 3:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 3);
    }
}