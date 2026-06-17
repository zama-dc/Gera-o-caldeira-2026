package exerc_7.dois;

public class Cachorro extends Animal{

    @Override
    public void emitirSom(){
        System.out.println("AU AU!");
    }

    public void abanarRabo(){
        System.out.println("Abanando o rabo");
    }
}