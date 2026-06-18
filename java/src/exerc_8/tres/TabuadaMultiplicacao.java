package exerc_8.tres;

public class TabuadaMultiplicacao implements Tabuada {
    public int multiplicador;
    public int resultado;

    public int getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(int multiplicador) {
        this.multiplicador = multiplicador;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public int mostrarTabuada(){
        for (int i = 1; i < 11 ; i++) {
            System.out.println(multiplicador+" X " +i+ " = "+multiplicador*i);
        }
        return 0;
    }

    public static void main(String[] args) {
        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();

        tabuada.setMultiplicador(21);
        System.out.println("Tabuada do "+tabuada.getMultiplicador()+":");
        tabuada.mostrarTabuada();
    }
}
