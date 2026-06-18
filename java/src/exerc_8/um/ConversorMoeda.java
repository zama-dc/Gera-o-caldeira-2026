package exerc_8.um;

public class ConversorMoeda implements ConversaoFinanceira {//implments significa aceitar o cntrato
    public double valorEmDolar;

    public double getValorEmDolar() {
        return valorEmDolar;
    }

    public void setValorEmDolar(double valorEmDolar) {
        this.valorEmDolar = valorEmDolar;
    }

    @Override
    public double converterDolarParaReal(double valorEmDolar){
        return valorEmDolar * 5.80;
    }

    public static void main(String[] args) {
        ConversorMoeda conversor = new ConversorMoeda();
        double resultado = conversor.converterDolarParaReal(100);
        System.out.println("100 dólares equivalem a R$ " + resultado);

    }
}
