package exerc_4_screenmatch2.modelo;

public class Filme {
    private String nome;//String é uma classe
    private int anoDeLancamento;
    private boolean incluidoNoPLano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    //get para deixarem as pessoas verem as info
    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPLano() {
        return incluidoNoPLano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    //SET
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPLano(boolean incluidoNoPLano) {
        this.incluidoNoPLano = incluidoNoPLano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    //MÉTODO

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }
    public void exibeFichaTecnica(){//não vai em retornar nenhum valor novo
        System.out.println("Inluído no plano: " + incluidoNoPLano);
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração em minutos: " + duracaoEmMinutos);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;//toda vez que colocar uma avaliacao, vai somar +1 ao meu total
    }

    public double retornaMediaDasAvaliacoes(){
        return somaDasAvaliacoes/totalDeAvaliacoes;
    }
    }
