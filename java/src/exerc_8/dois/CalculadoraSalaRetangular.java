package exerc_8.dois;

public class CalculadoraSalaRetangular implements CalculoGeometrico{
    public double altura;
    public double largura;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }


    public double calcularArea(double largura, double altura){
        return largura * altura;
    }

    public double calcularPerimetro(double largura, double altura){
        return 2 * (largura+altura);
    }

    public static void main(String[] args) {
        CalculadoraSalaRetangular calculadoraSala = new CalculadoraSalaRetangular();

        double resultadoArea = calculadoraSala.calcularArea(18, 20);
        double resultadoPerimetro = calculadoraSala.calcularPerimetro(8,1);

        System.out.println("O resultado da área do retângulo é "+resultadoArea);
        System.out.println("O resultado da perímetro do retângulo é "+resultadoPerimetro);
    }
}
