package exerc_4_screenmatch2;

public class Principal {//classe principal(mandachuva)
    public static void main(String[] args) {
        //↓ isso se chama instânciação de objeto(criar o objeto na memória a partir de uma classe, instanciação é o processo de criar o objeto na memória a partir de uma classe, enquanto a referência é apenas o "endereço" ou "ponteiro" que permite que você encontre e controle esse objeto)
        Filme meuFilme = new Filme();//criei um novo objeto do tipo filme | a parte da direita cria o obj | a esquerda é onde criamos espaço na memória, uma variável que vai servir de referência

        meuFilme.nome = "Oldboy";
        meuFilme.anoDeLancamento = 2003;
        meuFilme.duracaoEmMinutos = 120;
        meuFilme.incluidoNoPLano = true;

        meuFilme.exibeFichaTecnica();//chamo o método exibeFichaTecnica na classe principal


        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println();
        System.out.println("Média de avaliações no filme " + meuFilme.nome + ": " + meuFilme.retornaMediaDasAvaliacoes());
    }
}
