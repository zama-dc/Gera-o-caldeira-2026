package exerc_4_screenmatch2.modelo;

public class Filme extends Titulo {//extends -> herança | a classe filme faz tudo que o titulo faz
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
}
