import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        ContaBancaria conta = new ContaBancaria(1, "Yasmin Faraj");

        conta.depositar(1000);
        conta.sacar(350.3f);//esse f serve pro compilador entender que é um número float
        conta.depositar(350.3f);
        conta.depositar(100);

        System.out.println(conta.imprimirInfo());
    }
}
