package exerc_6;

public class IdadePessoa {
    private String nome;
    private int idade = 8;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void verificarIdade(){
        if(idade >=18){
            System.out.println("Maior de idade");
        }else{
            System.out.println("Menor de idade");
        }
    }

    public static void main(String[] args) {
        IdadePessoa idade = new IdadePessoa();
        idade.verificarIdade();
    }
}
