public class ContaBancaria {
    private int numeroConta;
    private String nomeTitular;
    private float saldo;

    public ContaBancaria(int numeroConta, String nomeTitular){
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = 0;
    }

    public void depositar(float valor){
        if(valor > 0){
            this.saldo += valor;
            System.out.println("Depósito realizado!");
        }
        else{
            System.out.println("Você só pode depositar valores acima de 0 reais.");
        }
    }

    public void sacar(float valor){
        if(valor > 0 && valor <= saldo){
            this.saldo -= valor;
            System.out.println("Saque no valor " + valor + " realizado.");
        }else{
            System.out.println("Você só pode sacar valores acima de 0 reais.");
        }
    }

    public float getSaldo(){
        return this.saldo;
    }

    public String imprimirInfo(){
        return "Número da Conta: " + this.numeroConta + ", Titular: " + this.nomeTitular + ", Saldo: " + this.getSaldo();
    }
}
