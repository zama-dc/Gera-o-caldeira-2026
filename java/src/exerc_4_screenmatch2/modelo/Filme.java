package exerc_4_screenmatch2.modelo;

import exerc_4_screenmatch2.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {//extends -> herança | a classe filme faz tudo que o titulo faz
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) retornaMediaDasAvaliacoes()/2;//casting novamente aqui(o int)
    }
}
