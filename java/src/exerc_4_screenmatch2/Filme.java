package exerc_4_screenmatch2;

public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPLano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    //MÉTODO
    void exibeFichaTecnica(){//não vai em retornar nenhum valor novo
        System.out.println("Inluído no plano: " + incluidoNoPLano);
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração em minutos: " + duracaoEmMinutos);
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;//toda vez que colocar uma avaliacao, vai somar +1 ao meu total
    }

    double retornaMediaDasAvaliacoes(){
        return somaDasAvaliacoes/totalDeAvaliacoes;
    }
    }
