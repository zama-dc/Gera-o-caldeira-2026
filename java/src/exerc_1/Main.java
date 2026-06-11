package exerc_1;

public class Main {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        double media = (5 + 9.8 + 6.3) /3;//ordem de precêdencia: se quero que primeiro resolva a adição, devo colocar entre parênteses
        String sinopse = "Filme de aventura com galã dos anos 80";

        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Média da nota do filme Top Gun: Maverick: " +media);
        System.out.println(sinopse);

        int estrelas = (int) (media/2);//média /2 convertida em um n int | conversão requerida de double(de media) para int - isso se chama casting
        System.out.println(estrelas);
    }
}