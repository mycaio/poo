public class Main {
    public static void main(String[] args){
        Livro novo = new Livro(01, "Branca de neve", "caio", "novo");

        novo.info();

        Pessoa caio = new Pessoa(151, "caio", 988, "caio@gmail");

        caio.info();
    }
}