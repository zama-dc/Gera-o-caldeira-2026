package screenmatch;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);// system in resumidamente rastreia a entrada do teclado

        System.out.println("Digite seu filme favorito: ");
        String filmeFavorito = ler.nextLine();//nextLine lê o que o usuário digitou

        System.out.println("Qual o ano de lançamento?");
        int anoDeLancamento = ler.nextInt();

        System.out.println("Nota para esse filme: ");
        double avaliacaoFilme = ler.nextDouble();

        System.out.println(filmeFavorito);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacaoFilme);
    }
}
