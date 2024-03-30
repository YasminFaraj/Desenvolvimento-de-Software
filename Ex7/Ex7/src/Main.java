import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int opcao;

        do{
            System.out.println("\n1 - Adicionar Produto");
            System.out.println("2 - Atualizar Produto");
            System.out.println("3 - Remover Produto");
            System.out.println("4 - Mostrar Estoque");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    Produto.adicionarProduto();
                    break;
                case 2:
                    Produto.atualizarProduto();
                    break;
                case 3:
                    Produto.removerProduto();
                    break;
                case 4:
                    Produto.mostrarEstoque();
                    break;
                case 5:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }while(opcao != 5);
    }
}