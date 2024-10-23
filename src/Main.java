import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*Livro novo = new Livro(01, "Branca de neve", "caio", "novo");

        novo.info();

        Pessoa caio = new Pessoa(151, "caio", 988, "caio@gmail");

        caio.info();
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("     print(\"\"\"\n" +
                "       .--.                   .---.           \n" +
                "   .---|__|           .-.     |~~~|   \n" +
                ".--|===|--|_          |_|     |~~~|--.\n" +
                "|  |===|  |'\\     .---!~|  .--|   |--|\n" +
                "|%%|   |  |.'\\    |===| |--|%%|   |  |\n" +
                "|%%|   |  |\\.'\\   |   | |__|  |   |  |\n" +
                "|  |   |  | \\  \\  |===| |==|  |   |  |\n" +
                "|  |   |__|  \\.'\\ |   |_|__|  |~~~|__|\n" +
                "|  |===|--|   \\.'\\|===|~|--|%%|~~~|--|\n" +
                "^--^---'--^    `-'`---^-^--^--^---'--'\n" +
                "-------- MENU DA BIBLIOTECA ---------\n" +
                "1) Livro\n" +
                "2) Pessoa\n" +
                "3) Empréstimo\n" +
                "4) Relatório\n" +
                "5) Sair  ");

        int resposta = scanner.nextInt();

        switch (resposta){
            case 1:

                break;
            case 2:
                Pagepessoa.pagepessoa();
                break;
        }
    }
}