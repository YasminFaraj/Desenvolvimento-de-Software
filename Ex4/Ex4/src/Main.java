public class Main {
    public static void main(String[] args){
        Jogador jogador1 = new Jogador("Yasmin", 4.5f, 7);

        System.out.print("Informações do jogador: " + jogador1.exibirJogador());

        jogador1.aumentarNivel();
        jogador1.aumentarPontuacao(15.3f);
        
        Jogador jogador2 = new Jogador("Jonatas", 6, 5);

        System.out.println("Informações do jogador: " + jogador1.exibirJogador());
        System.out.println();
        System.out.println("Informações do jogador: " + jogador2.exibirJogador());
    }
}
