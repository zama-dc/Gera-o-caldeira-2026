package exerc_8.quatro;

public class ConversorTemperatura implements ConversorTemperaturaPadrao{
    public double celsius;
    public double farenheit;

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getFarenheit() {
        return farenheit;
    }

    public void setFarenheit(double farenheit) {
        this.farenheit = farenheit;
    }

    public double celsiusParaFarenheit(double celsius){
        return (celsius * 1.8)+32;
    }

    public double fahrenheitParaCelsius(double farenheit){
        return (farenheit - 32) *5 / 9;
    }

    public static void main(String[] args) {
        ConversorTemperatura conversor = new ConversorTemperatura();
        System.out.println("Temperatura de 38°C convertida em Farenheit: " +conversor.celsiusParaFarenheit(38));
        System.out.println("Temperatura de 21°F convertida em Celsius: " +conversor.fahrenheitParaCelsius(21));

    }
}