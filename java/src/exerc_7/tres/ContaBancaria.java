package exerc_7.tres;

public class ContaBancaria {
    //depositar(), sacar() e consultarSaldo()
    private String nomeTitularConta;
    private int numeroConta;
    protected double saldo;//

    public String getNomeTitularConta() {
        return nomeTitularConta;
    }

    public void setNomeTitularConta(String nomeTitularConta) {
        this.nomeTitularConta = nomeTitularConta;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }

    public double depositarDinheiro(double valor){//
        this.saldo += valor;//nova variável
        return valor;
    }

    public double sacarDinheiro(double valor){//
        this.saldo -= valor;
        return valor;
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.depositarDinheiro(1000);
        conta.consultarSaldo();
        conta.sacarDinheiro(200);
        conta.consultarSaldo();

        ContaCorrente contacorr = new ContaCorrente();
        contacorr.depositarDinheiro(200);
        contacorr.cobrarTarifaMensal();
        contacorr.consultarSaldo();
        contacorr.sacarDinheiro(100);
        contacorr.consultarSaldo();
    }
}
