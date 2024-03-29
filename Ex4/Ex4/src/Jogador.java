public class Jogador {
    private String nome;
    private float pontuacao;
    private int nivel;

    Jogador(String nome, float pontuacao, int nivel){
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.nivel = nivel;
    }

    void setNome(String nome){
        this.nome = nome;
    }

    String getNome(){
        return this.nome;
    }

    void setPontuacao(float pontuacao){
        this.pontuacao = pontuacao;
    }

    float getPontuacao(){
        return this.pontuacao;
    }

    void setNivel(int nivel){
        this.nivel = nivel;
    }

    int getNivel(){
        return this.nivel;
    }

    void aumentarPontuacao(float pontos){
        if(pontos > 0){
            this.pontuacao += pontos;
            System.out.println("Os pontos de " + this.nome + " foram aumentados.");
        }else{
            System.out.println("Pontos insuficientes.");
        }
    }

    void aumentarNivel(){
        this.nivel ++;
        System.out.println();
        System.out.println("Nível de " + this.nome + " aumentado.");
    }

    private void dados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Pontuação: " + this.pontuacao);
        System.out.println("Nível: " + this.nivel);
    }

    void exibirJogador(){
        dados();
    }
}

