import java.util.Scanner;

public class Pagepessoa {
    public static void pagepessoa(){
        System.out.println("1) Cadastrar Pessoa\n" +
                "2) Alterar Cadastro de Pessoa");
        Scanner scanner = new Scanner(System.in);
        int resp = scanner.nextInt();
        if (resp == 1){
            System.out.println("Digite seu CPF: ");
            int cpf = scanner.nextInt();
            System.out.println("Digite seu nome: ");
            String nome = scanner.next();
            System.out.println("Digite seu telefone: ");
            int telefone = scanner.nextInt();
            System.out.println("Digite seu email: ");
            String email = scanner.next();

            Pessoa pessoa = new Pessoa(cpf, nome, telefone, email);
            pessoa.info();
        }
    }
}
