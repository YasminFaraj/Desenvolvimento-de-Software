import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o número 1: ");
        float num1 = Float.parseFloat(leitor.nextLine());

        System.out.print("Informe o número 2: ");
        float num2 = Float.parseFloat(leitor.nextLine());
        
        System.out.println("Soma: " + Calculadora.adicao(num1, num2));
    }
}