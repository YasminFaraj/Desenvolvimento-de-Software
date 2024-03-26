import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o número 1: ");
        float num1 = Float.parseFloat(leitor.nextLine());

        System.out.print("Informe o número 2: ");
        float num2 = Float.parseFloat(leitor.nextLine());

        System.out.print("Informe qual operação será feita: ");
        int opcao = Integer.parseInt(leitor.nextLine());
        
        switch(opcao){
            case 1:
            System.out.println("Soma: " + Calculadora.adicao(num1, num2));
            break;

            case 2:
            System.out.println("Subtração: " + Calculadora.sub(num1, num2));
            break;

            case 3:
            System.out.println("Multiplicação: " + Calculadora.mult(num1, num2));
            break;

            case 4:
            System.out.println("Divisão: " + Calculadora.div(num1, num2));
            break;
        }
    }
}