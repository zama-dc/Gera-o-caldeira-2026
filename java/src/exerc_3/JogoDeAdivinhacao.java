package exerc_3;

import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinhacao {
        public static void main(String[] args) {
            int numeroGerado =  new Random().nextInt(101);// 101 pq o 0 tbm conta como numero
            Scanner ler = new Scanner(System.in);// system in resumidamente rastreia a entrada do teclado
            int tentativas = 0;
            int chuteDaPessoa = 0;

            System.out.println();//um espaço
            System.out.println("Olá! Bem-vindo ao jogo de adivinhação!");
            System.out.println("Gerarei um número aleatório entre 0 a 100 e você deve tentar acertar o número em que estou pensando em até 5 tentativas.");
            System.out.println();//um espaço


            while (chuteDaPessoa != numeroGerado && tentativas <5){
                System.out.println();//um espaço
                System.out.println("Adivinhe o número em que estou pensando... Agora!");System.out.println();//um espaço
                chuteDaPessoa = ler.nextInt();

                tentativas++;

                if(chuteDaPessoa == numeroGerado){
                    System.out.println("Parabéns! Depois de " + tentativas + " tentativas cocê acertou em cheio!! Até parece que você saber ler mentes!");
                    break;//break SEMPRE dentro do loop
                }else if (chuteDaPessoa > numeroGerado){
                    System.out.println("O número que pensei é menor, hein");
                } else {
                    System.out.println("O número que pensei é maior, hein");
                }
            }
            if (tentativas == 5 && chuteDaPessoa != numeroGerado) {
                System.out.println("Você não conseguiu acertar o número em 05 tentativas. O número era: " + numeroGerado);
            }


        }
    }

