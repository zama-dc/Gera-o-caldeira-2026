package screenmatch2;

public class Principal {
    public static void main(String[] args) {
        //↓ isso se chama instânciação de objeto(criar o objeto na memória a partir de uma classe, instanciação é o processo de criar o objeto na memória a partir de uma classe, enquanto a referência é apenas o "endereço" ou "ponteiro" que permite que você encontre e controle esse objeto)
        Filme meuFilme = new Filme();//criei um novo objeto do tipo filme | a parte da direita cria o obj | a esquerda é onde criamos espaço na memória, uma variável que vai servir de referência
        meuFilme.nome = "Oldboy";
        meuFilme.anoDeLancamento = 2003;
        meuFilme.duracaoEmMinutos = 120;

        System.out.println(meuFilme.nome);
        System.out.println(meuFilme.anoDeLancamento);
        System.out.println(meuFilme.duracaoEmMinutos);
    }
}
