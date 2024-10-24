import java.util.Scanner;


public class PageLivro {
    public static void pagelivro(){
        System.out.println("\"\"\" \n" +
                "1) Cadastrar Livro\n" +
                "2) Alterar Situação do Livro\n" +
                "3) Alterar Estado do Livro\n" +
                "4) Voltar");

        Scanner scanner = new Scanner(System.in);

        int resp = scanner.nextInt();

        if(resp == 1) {
            System.out.println("Informe o codigo do Livro: ");
            int codigo = scanner.nextInt();

            System.out.println("Informe o Titulo do livro: ");
            String titulo = scanner.next();

            System.out.println("Informe o Autor do livro: ");
            String autor = scanner.next();

            System.out.println("Informe o Estado do livro: ");
            String estado = scanner.next();

            Livro livro = new Livro(codigo, titulo, autor, estado);
            livro.info();
        } else if (resp == 4) {
            Main.menuPrincipal();
            int resposta = scanner.nextInt();
        }

    }
}
