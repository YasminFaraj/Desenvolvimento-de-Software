public class Carro {

    private String marca;
    private String modelo;
    private String placa;
    private int ano;
    private int velocidadeAtual;

    Carro(String marca, String modelo, String placa, int ano, int velocidadeAtual){
    this.marca = marca;
    this.modelo = modelo;
    this.placa = placa;
    this.ano = ano;
    this.velocidadeAtual = velocidadeAtual;
    }

    void setMarca(String marca){
        this.marca = marca;
    }

    String getMarca(){
        return this.marca;
    }

    void setModelo(String modelo){
        this.modelo = modelo;
    }

    String getModelo(){
        return this.modelo;
    }

    void setPlaca(String placa){
        this.placa = placa;
    }

    String getPlaca(){
        return this.placa;
    }

    void setAno(int ano){
        this.ano = ano;
    }

    int getAno(){
        return this.ano;
    }

    void setVelocidade(int velocidadeAtual){
        this.velocidadeAtual = velocidadeAtual;
    }

    int getVelocidade(){
        return this.velocidadeAtual;
    }

    void acelerar(){
        if(this.velocidadeAtual < 270){
            this.setVelocidade(getVelocidade() + 5);
            System.out.println("Acelerando...");
        }else{
            System.out.println("Você atingiu o limite de velocidade!");
        }
    }

    void frear(){
        if(this.velocidadeAtual > 0){
            this.setVelocidade(getVelocidade() - 5);
            System.out.println("Freando...");
        }
        else{
            System.out.println("Você está parado.");
        }
    }

    private void dados(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Placa: " + this.placa);
        System.out.println("Ano: " + this.ano);
        System.out.println("Velocidade atual: " + this.velocidadeAtual);
    }

    void exibirInfo(){
        dados();
    }

}
