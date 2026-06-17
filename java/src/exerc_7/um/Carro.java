package exerc_7.um;

public class Carro {
    private  String modelo;
    private double precoCarroAno26;
    private double precoCarroAno25;
    private double precoCarroAno24;

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return "aaa";
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecoCarroAno26() {
        return precoCarroAno26;
    }

    public void setPrecoCarroAno26(double precoCarroAno26) {
        this.precoCarroAno26 = precoCarroAno26;
    }

    public double getPrecoCarroAno25() {
        return precoCarroAno25;
    }

    public void setPrecoCarroAno25(double precoCarroAno25) {
        this.precoCarroAno25 = precoCarroAno25;
    }

    public double getPrecoCarroAno24() {
        return precoCarroAno24;
    }

    public void setPrecoCarroAno24(double precoCarroAno24) {
        this.precoCarroAno24 = precoCarroAno24;
    }

    public void definirModelo(String modelo){
        this.modelo = modelo;

    }
    public void definirPreco(double precoCarroAno26, double precoCarroAno25, double precoCarroAno24){
        this.precoCarroAno26 = precoCarroAno26;
        this.precoCarroAno25 = precoCarroAno25;
        this.precoCarroAno24 = precoCarroAno24;
    }

    public void exibeDetalhes(){
        System.out.println("-----");
        System.out.println("Modelo do carro: "+getModelo());
        System.out.println("Cor "+getCor());
        System.out.println();
        System.out.println("Preço em 2026: "+precoCarroAno26);
        System.out.println("Preço em 2025: "+precoCarroAno25);
        System.out.println("Preço em 2024: "+precoCarroAno24);
        System.out.println();
        System.out.println("Menor preço: "+calculaMenorPreco());
        System.out.println("Maior preço: "+calculaMaiorPreco());
    }

    private double calculaMenorPreco(){
        double menorPreco = precoCarroAno26;//menorPreco equivale a precoCarroAno26

        if(precoCarroAno25 < menorPreco){//comparo o preço em 25 com o menorPreco(que era precoCarro26)
            menorPreco = precoCarroAno25;//se for menor, o menorPreco se atualiza como precoCarroAno25
        }
        if(precoCarroAno24 < menorPreco){
            menorPreco = precoCarroAno24;
        }
        return menorPreco;
    }

    private double calculaMaiorPreco(){
        double maiorPreco = precoCarroAno26;

        if(precoCarroAno25 > maiorPreco){
            maiorPreco = precoCarroAno25;
        }
        if(precoCarroAno24 > maiorPreco){
            maiorPreco = precoCarroAno24;
        }
        return maiorPreco;
    }

    public static void main(String[] args) {
        //usar modelocar porque a classe mãe(essa) é cega para as características da filha
        ModeloCarro modelocar = new ModeloCarro("Esmeralda");

        //usar a variável da classe filha pq ela herda tudo, assim guardamos tudo no mesmo pedaço de memória(classe filha é mais completa que a mãe)
        modelocar.definirModelo("Fiat Uno");
        modelocar.definirPreco(26.000, 20.000, 6.000);

        modelocar.exibeDetalhes();
    }
}