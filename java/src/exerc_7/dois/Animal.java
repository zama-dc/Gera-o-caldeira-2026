package exerc_7.dois;

public class Animal {

    public void emitirSom(){
        System.out.println("Som do bicho");
    }

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.abanarRabo();
        System.out.println("----");
        Gato gato = new Gato();
        gato.emitirSom();
        gato.arranharMoveis();
    }

}
