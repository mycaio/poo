public class Pessoa {
    private int cpf;
    private String nome;
    private int telefone;
    private String email;

    public Pessoa(int cpf, String nome, int telefone, String email){
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public void info(){
        System.out.println("CPF: " + this.cpf + ", Nome: " + this.nome + ", Telefone: " + this.telefone + ", Email: " + this.email);
    }
}
