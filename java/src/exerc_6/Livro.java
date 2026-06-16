package exerc_6;

public class Livro {
    private String titulo;
    private String autor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exibeDetalhes(){
        System.out.println("Livro: "+getTitulo());
        System.out.println("Autor do livro "+getTitulo()+ ": "+getAutor());
    }

    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.setTitulo("Hilda Furacão");
        livro.setAutor("Roberto Drummond");

        livro.exibeDetalhes();
    }
}
