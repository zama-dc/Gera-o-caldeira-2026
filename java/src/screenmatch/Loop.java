package screenmatch;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);// system in resumidamente rastreia a entrada do teclado
        double mediaAvaliacaoFilme = 0;
        double avaliacaoFilme = 0;//NOTA QUE A PESSOA VAI DAR P FILME    -   variável aqui em cima pq quero acumular as avaliações para fazer a média

        for (int i = 0; i < 3 ; i++) {//iteração =  processo de repetir um conjunto de instruções ou ações até que uma condição específica seja atingida | o >i< é o nosso iterador
            System.out.println("Nota para esse filme: ");
            avaliacaoFilme = ler.nextDouble();
            mediaAvaliacaoFilme += avaliacaoFilme;//+= -> significa que recebe o que já tinha(uma nota 0) e o que estou atribuindo agora(a nota que o usuário digitar)
        }
        System.out.println("Média de avaliações: " + mediaAvaliacaoFilme/3);

    }
}
