public class ContaBancaria {
    private int numeroConta;
    private String nomeTitular;
    private float saldo;

    ContaBancaria(int numeroConta, String nomeTitular){
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = 0;
    }

    void setDepositar(float valor){
        if(valor > 0){
            this.saldo += valor;
            System.out.println("Depósito realizado!");
        }
        else{
            System.out.println("Você só pode depositar valores acima de 0 reais.");
        }
    }

    float getDepositar(){
        return this.getSaldo();
    }

    void setSacar(float valor){
        if(valor > 0 && valor <= saldo){
            this.saldo -= valor;
            System.out.println("Saque no valor " + valor + " realizado.");
        }else{
            System.out.println("Você só pode sacar valores acima de 0 reais.");
        }
    }

    float getSacar(){
        return this.getSaldo();
    }

    float getSaldo(){
        return this.saldo;
    }

    public String imprimirInfo(){
        return "Número da Conta: " + this.numeroConta + ", Titular: " + this.nomeTitular + ", Saldo: " + this.getSaldo();
    }
}
