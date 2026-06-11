package screenmatch;

public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 1990;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if(anoDeLancamento >= 2022){
            System.out.println("Lançamentos em alta!");
        }else{
            System.out.println("Não é um filme atual mas ainda sim um filme que vale a pena assistir!");
        }

        if(incluidoNoPlano == true && tipoPlano.equals("plus") ){
            System.out.println("Acesso liberado.");
        }else{
            System.out.println("Deve locar o filme.");
        }
    }
}
