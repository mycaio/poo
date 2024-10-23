public class Livro {

        private int codigo;
        private String titulo;
        private String autor;
        private String estado;
        private String situacao;

    public Livro(int codigo, String titulo, String autor, String estado){
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.estado = estado;
        this.situacao = "disponivel";
    }

    public void info(){
        System.out.println("codigo: " + this.codigo + ", titulo: " + this.titulo + ", autor: " + this.autor + ", estado: " + this.estado + ", Situação" + this.situacao);
    }

    public String getSituacao(){
        return situacao;
    }

    public void setSituacao(String situacao){
        this.situacao = situacao;
    }
}
