package exerc_6;

public class Produto {
    private String nome;
    private double preco = 18.00;

    private double valorPercentual;

    public double getValorPercentual() {
        return valorPercentual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void aplicarDesconto(double desconto){
        this.valorPercentual = desconto;

        this.preco = this.preco - (this.preco * (desconto/100));
    }

    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.aplicarDesconto(10);

        System.out.println("Preço: " +produto.getPreco());
        System.out.println("Desconto aplicado: " +produto.getValorPercentual());
    }
}
