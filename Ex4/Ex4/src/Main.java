public class Main {
    public static void main(String[] args){
        Jogador jogador1 = new Jogador("Yasmin", 4.5f, 7);
        Jogador jogador2 = new Jogador("Jonatas", 6, 5);

        jogador1.aumentarNivel();
        jogador1.aumentarPontuacao(15.3f);

        jogador1.exibirJogador();
        System.out.println();
        jogador2.exibirJogador();
    }
}
