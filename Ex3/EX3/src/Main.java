public class Main {
    public static void main(String[] args){
        ContaBancaria conta = new ContaBancaria(1, "Yasmin Faraj");

        conta.setDepositar(1000);
        conta.setSacar(350.3f);//esse f serve pro compilador entender que é um número float
        conta.setDepositar(100);

        ContaBancaria conta2 = new ContaBancaria(2, "Jonatas Moura");

        conta2.setDepositar(3000);
        conta2.setSacar(2.9f);
        
        System.out.println(conta2.imprimirInfo());
        System.out.println(conta.imprimirInfo());
    }
}
