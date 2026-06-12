package exerc_3;

import java.util.Scanner;

public class Exercicios2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double numero = 0;

        /* Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo". */
        System.out.print("Digite um número: "); numero = leia.nextDouble();

        if (numero <0){
            System.out.println("O número " + numero + " é um número negativo");
        }else{
            System.out.println("O número " + numero + " é um número positivo");
        }
        System.out.println("----------------------------------------");

        //===================================================================

        /* Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior. */

            System.out.println();//um espaço
            System.out.print("Digite um número inteiro(não digite números com pontos ou vírgula): "); int numero1 = leia.nextInt();
            System.out.print("Digite um número inteiro(não digite números com pontos ou vírgula): "); int numero2 = leia.nextInt();
            System.out.println();//um espaço

        if (numero1 == numero2){
            System.out.println("O número " + numero1 + " e número " + numero2 + "são iguais.");
        } else if (numero1 != numero2) {
            System.out.println("Os números " + numero1 + " e " + numero2 + " são diferentes.");
        }
        if (numero1 > numero2){
            System.out.println("O número " + numero1 + " é maior que o número " + numero2);
        }else{
            System.out.println("O número " + numero2 + " é maior que o número " + numero1);
        }
        System.out.println("----------------------------------------");

        //===================================================================

        /* Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada. */

        System.out.println("Escolha uma opção");
        System.out.println("1. Calcular área do quadrado");
        System.out.println("2. Calcular área do círculo");
        System.out.print("Digite aqui: "); int opcao = leia.nextInt();
        System.out.println();

        switch (opcao){
            case 1:
                System.out.print("Qual o tamanho do lado? "); double areaQuadrado = leia.nextDouble();
                System.out.println("A área do quadrado é: " + areaQuadrado*2);
                break;

            case 2:
                System.out.print("Qual o raio de distância do centro do círculo até a borda? "); double raioCirculo = leia.nextDouble();
                System.out.println("A área do círculo é: " + 3.14 * raioCirculo * raioCirculo);
                break;

            default://caso escolha algo alem da 1 e 2
                System.out.println("Essa opção não existe.");

        }
        System.out.println("----------------------------------------");

        //===================================================================
        /* Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10. */

        System.out.print("Digite um número e eu exibirei a tabuada dele: "); int numeroTabuada = leia.nextInt();
        System.out.println();

        for (int i = 1; i < 11 ; i++) {
            System.out.println(numeroTabuada + " X " + i + " = " + numeroTabuada*i);
        }
        System.out.println("----------------------------------------");

        //===================================================================
        /* Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par ou ímpar e exiba uma mensagem correspondente. */

        System.out.print("Digite um número: "); int numeroDigitado = leia.nextInt();

        if(numeroDigitado % 2 == 0){
            System.out.println(+ numeroDigitado + " é um número par");
        }else{
            System.out.println(+ numeroDigitado + " é um número ímpar");
        }
        System.out.println("----------------------------------------");

        //===================================================================
        /* Crie um programa que solicite ao usuário um número e calcule o fatorial desse número. */

        System.out.print("Digite um número: "); int numeroDigitadoFatorial = leia.nextInt();

        int fatorial = 1;

        for (int i = 1; i <= numeroDigitadoFatorial; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numeroDigitadoFatorial + " é: " + fatorial);
    }
    }