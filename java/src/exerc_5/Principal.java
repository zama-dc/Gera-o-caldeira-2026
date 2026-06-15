package exerc_5;

public class Principal {

    public static void main(String[] args) {
/* 1 */
        Pessoa pessoa = new Pessoa();
        System.out.println();
        pessoa.saudacao();

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
/* 2 */
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.dobroNumero((2));
        System.out.println("O dobro é: " + resultado);

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
/* 3 */
        Musica musica = new Musica();
        musica.exibeFichaTecnica();
        musica.avalia(4);
        musica.avalia(7);
        musica.avalia(10);
        System.out.println(musica.avalicao);
        System.out.println(musica.retornaMediaDasAvaliacoes());
        System.out.println();
        System.out.println("Média de avaliações da música " + musica.tituloMusica + " de " + musica.artista + " é " + musica.retornaMediaDasAvaliacoes());
        musica.retornaMediaDasAvaliacoes();

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
/* 4 */
        Carro carro = new Carro();
        carro.exibeFichaTecnica();
        System.out.println();
        System.out.println("A idade do carro " + carro.modelo + " é de " + carro.calculaIdadeCarro() + " anos ");
        carro.calculaIdadeCarro();

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
/* 5 */
        Aluno aluno = new Aluno();
        aluno.exibeFichaTecnica();

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

    }
}
