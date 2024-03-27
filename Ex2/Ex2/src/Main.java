import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("Bem-vindo à sua biblioteca!");
            System.out.println("Informe qual opção você deseja:");
            System.out.println("1. Adicionar um livro.");
            System.out.println("2. Ver coleção de livros.");
            System.out.println("3. Sair.");
            opcao = Integer.parseInt(leitor.nextLine());

        } while (opcao != 3);
    }
}
