package desafioFinal;

import java.util.Scanner;

/* operacoes
   1-consultar dados
   2-receber valor
   3-transferir valor
   4-sair
   digite a opcao desejada
*/
public class ContaBancaria {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String tipoConta = "";
        double saldoCliente = 0;
        String nomeCliente = "";
        int opcao = 0;

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Olá bem-vindo(a) ao banco digital Time Bank");
        System.out.println();

        System.out.print("Já possui uma conta conosco? (S/N) ");
        String respostaCliente = leia.next(); // inicialmente era char mas não achei quem pudesse ler

        if (respostaCliente.equalsIgnoreCase("N")) {

            System.out.print("Deseja criar uma? (S/N) ");
            String criarConta = leia.next();

            leia.nextLine(); // limpa o enter que sobrou do next()

            System.out.println();

            if (criarConta.equalsIgnoreCase("S")) {

                System.out.println("Para criar sua conta preciso de seus dados pessoais");
                System.out.println();

                System.out.print("Nome: ");
                nomeCliente = leia.nextLine(); // lê tudo que eu digitar inclusive espaços

                System.out.print("Tipo de conta (corrente/poupança): ");
                tipoConta = leia.next();

                while (!tipoConta.equalsIgnoreCase("corrente")
                        && !tipoConta.equalsIgnoreCase("poupança")) {

                    System.out.println("Tipo de conta inválido!");

                    System.out.print("Tipo de conta (corrente/poupança): ");
                    tipoConta = leia.next();
                } // fim while

                System.out.print("Saldo: ");
                saldoCliente = leia.nextDouble();

                while (saldoCliente < 0) {
                    System.out.println("O saldo não pode ser negativo.");

                    System.out.print("Saldo: ");
                    saldoCliente = leia.nextDouble();
                } // fim while

                System.out.println();
                System.out.println("Conta criada com sucesso!");
            } else {
                System.out.println("Criação de conta cancelada");
                return;
            }
        }

        if (respostaCliente.equalsIgnoreCase("S")
                || respostaCliente.equalsIgnoreCase("N")) {

            while (opcao != 4) {
                System.out.println();
                System.out.println("O que deseja:");
                System.out.println("1. Consultar dados");
                System.out.println("2. Receber valor");
                System.out.println("3. Transferir valor");
                System.out.println("4. Sair");

                System.out.print("Digite aqui: "); opcao = leia.nextInt();

                System.out.println();

                switch (opcao) {

                    case 1:
                        System.out.println("Nome: " + nomeCliente);
                        System.out.println("Tipo de conta: " + tipoConta);
                        System.out.println("Saldo: " + saldoCliente);
                        break;

                    case 2:
                        System.out.print("Valor recebido: ");
                        double valorRecebido = leia.nextDouble();

                        saldoCliente += valorRecebido;

                        System.out.println("Novo saldo: " + saldoCliente);
                        break;

                    case 3:
                        System.out.print("Valor a ser transferido: ");
                        double valorTransferido = leia.nextDouble();

                        if (valorTransferido > saldoCliente) {
                            System.out.println("Saldo insuficiente!");
                        } else {
                            saldoCliente -= valorTransferido;

                            System.out.println("-" + valorTransferido);
                            System.out.println("Saldo total: " + saldoCliente);
                        }

                        break;

                    case 4:
                        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                        System.out.println("Fechando aplicativo Time Bank...");
                        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                        break;

                    default:
                        System.out.println("Opção inválida!");
                }
            }
        }//fim while(opcao)



        leia.close();
    }
}