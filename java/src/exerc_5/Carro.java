package exerc_5;


public class Carro {
    String modelo = "Volkswagen Golf GTI";
    int ano = 2020;
    String cor = "indigo";
    int anoAtual = 2026;
    void exibeFichaTecnica(){//não vai em retornar nenhum valor novo
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }
    double calculaIdadeCarro(){
        return anoAtual-ano;
    }
}
