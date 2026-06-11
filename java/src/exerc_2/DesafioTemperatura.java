package exerc_2;

public class DesafioTemperatura {
    public static void main(String[] args) {
        double temperaturaEmCelsius = 13;
        double temperaturaEmFahrenheit = (temperaturaEmCelsius * 1.8) + 32;

        String mensagemFinal = String.format("A temperatura de %f°C em Celsius equivale a %f°F em Fahrenheit.", temperaturaEmCelsius, temperaturaEmFahrenheit);
        System.out.println(mensagemFinal);
        System.out.println("\n" + "Agora com as casa decimais corretas: ");

        int temperaturaEmFahrenheitInteira = (int) temperaturaEmFahrenheit;//faço casting pq quero um número int para apresentar para as pessoas
        int temperaturaEmCelsiusInteira = (int) temperaturaEmCelsius;//faço casting pq quero um número int para apresentar para as pessoas

        System.out.println("A temperatura em Fahrenheit inteira é: " + temperaturaEmFahrenheitInteira + "\n" + "E a de Celsius é: "+temperaturaEmCelsiusInteira);
    }
}
