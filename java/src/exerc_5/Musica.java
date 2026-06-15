package exerc_5;

public class Musica {
    String tituloMusica = "Life Goes On";
    String artista = "Oliver Tree";
    int anoDeLancamento = 2021;
    int avalicao = 0;
    int numAvaliacoes = 0;

    void exibeFichaTecnica(){//não vai em retornar nenhum valor novo
        System.out.println("Música: " + tituloMusica);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    void avalia(double nota){// crio uma nova variável chamada nota
        avalicao += nota;
        numAvaliacoes++;
    }
    double retornaMediaDasAvaliacoes(){
        return avalicao/numAvaliacoes;
    }
}
