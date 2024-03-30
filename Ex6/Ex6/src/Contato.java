public class Contato {
    private String nome;
    private int telefone;

    Contato(String nome, int telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

    void setNome(String nome){
        this.nome = nome;
    }

    String getNome(){
        return this.nome;
    }

    void setTelefone(int telefone){
        this.telefone = telefone;
    }

    int getTelefone(){
        return this.telefone;
    }
}
