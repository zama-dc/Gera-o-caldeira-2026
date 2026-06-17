package exerc_4_screenmatch2.calculos;

import exerc_4_screenmatch2.modelo.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;//vai acumulando

    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void inclui(Filme f){//passo o filme e soma no tempototal o getDuracaoEmMinutos
//        tempoTotal += f.getDuracaoEmMinutos();//pego o tempo total e incremento
//    }
//
//    //SOBRECARGA DE MÉTODOS(mesmo nome mas dados diferentes)
//    public void inclui(Serie s){//passo o filme e soma no tempototal o getDuracaoEmMinutos
//        tempoTotal += s.getDuracaoEmMinutos();//pego o tempo total e incremento
//    }

    //POLIMORFISMO
    public void inclui(Titulo titulo){//passar como argumento a classe-mãe Titulo(porque tanto filme quanto séries são títulos)
        this.tempoTotal += titulo.getDuracaoEmMinutos();//pego o tempo total e incremento
    }
}
