public class Main {
    public static void main(String[] args){
        ContaBancaria conta = new ContaBancaria(1, "Yasmin Faraj");

        conta.setDepositar(1000);
        conta.setSacar(350.3f);//esse f serve pro compilador entender que é um número float
        conta.setDepositar(100);

        System.out.println(conta.imprimirInfo());
    }
}
