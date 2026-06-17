package exerc_7.um;

public class ModeloCarro extends Carro{
    //ESSA CLASSE HERDA TUDO DE CARRO
    private String cor;

    //construtor para definir a informação específica ao criar a instância
    public ModeloCarro(String cor) {
        this.cor = cor;
    }

    @Override//sobrescrito
    public String getCor() {
        return this.cor;
    }
}
