public class Livro {
    String titulo;
    String autor;
    int ano;

    Livro(String tt, String aut, int ano) {
        titulo = tt;
        autor = aut;
        this.ano = ano;
    }
    
    void exibir_info() {
        System.out.println("Livros:");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + ano);
    }
}
