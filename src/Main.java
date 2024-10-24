import java.util.Scanner;

public class Main {

    public static void menuPrincipal(){
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
    }


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int resposta;
        do{
            menuPrincipal();
            resposta = scanner.nextInt();

            switch (resposta) {
                case 1:
                    PageLivro.pagelivro();

                    break;
                case 2:
                    Pagepessoa.pagepessoa();

                    break;

            }
        } while (resposta != 5);


    }
}