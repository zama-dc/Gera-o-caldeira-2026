package exerc_6;

public class Aluno {
    private String nome;
    private double notas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotas() {
        return notas;
    }

    public void setNotas(double notas) {
        this.notas = notas;//armazeno a média aqui
    }

    public void calcularMedia(double nota1, double nota2){//inicializo as variaveis aqui
        this.notas = (nota1 + nota2) /2;//faço a conta | o this indica que estou me referindo à variável da classe
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.calcularMedia(2, 5);

        System.out.println("Média das notas: "+aluno.getNotas());//se quero mostrar o valor, uso get aqui
    }
}
