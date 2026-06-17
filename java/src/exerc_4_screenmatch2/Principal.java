package exerc_4_screenmatch2;

import exerc_4_screenmatch2.calculos.CalculadoraDeTempo;
import exerc_4_screenmatch2.modelo.Filme;
import exerc_4_screenmatch2.modelo.Serie;
import exerc_5.Calculadora;

public class Principal {//classe principal(mandachuva)
    public static void main(String[] args) {
        //↓ isso se chama instânciação de objeto(criar o objeto na memória a partir de uma classe, instanciação é o processo de criar o objeto na memória a partir de uma classe, enquanto a referência é apenas o "endereço" ou "ponteiro" que permite que você encontre e controle esse objeto)
        Filme meuFilme = new Filme();//criei um novo objeto do tipo filme | a parte da direita cria o obj | a esquerda é onde criamos espaço na memória, uma variável que vai servir de referência

        meuFilme.setNome("Oldboy");
        meuFilme.setAnoDeLancamento(2003);
        meuFilme.setDuracaoEmMinutos(120);
        System.out.println("Duração do filme: "+meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();//chamo o método exibeFichaTecnica na classe principal


        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações:  " + meuFilme.getTotalDeAvaliacoes());
        System.out.println();
        //o filme x tem nota 8.3 com 80 mil avaliações
        System.out.println("Média de avaliações no filme " + meuFilme.getNome() + ": " + meuFilme.retornaMediaDasAvaliacoes());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2004);
        lost.exibeFichaTecnica();
        lost.exibeFichaTecnica();
        lost.setTemporadas(6);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(40);
        System.out.println("Duração para maratonar Lost: "+lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();//criei um novo objeto do tipo filme | a parte da direita cria o obj | a esquerda é onde criamos espaço na memória, uma variável que vai servir de referência
        outroFilme.setNome("Shrek");
        outroFilme.setAnoDeLancamento(2001);
        outroFilme.setDuracaoEmMinutos(90);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-");
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);//série
        System.out.println(calculadora.getTempoTotal());
    }
}
