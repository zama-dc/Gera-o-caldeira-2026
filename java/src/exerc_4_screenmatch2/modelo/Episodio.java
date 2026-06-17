package exerc_4_screenmatch2.modelo;

import exerc_4_screenmatch2.calculos.Classificavel;

public class Episodio implements Classificavel {//cada episódio pertence a uma série e cada série tem seus episódios x
    private  int numero;//cada serie tem um n de episodios
    private  String nome;
    private Serie serie;
    private int totalVisualizacoes;

    public int getTotalVisualizacoes() {
        return totalVisualizacoes;
    }

    public void setTotalVisualizacoes(int totalVisualizacoes) {
        this.totalVisualizacoes = totalVisualizacoes;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
        if (totalVisualizacoes >100){
            return 4;
        }else {
            return 2;
        }
    }
}
