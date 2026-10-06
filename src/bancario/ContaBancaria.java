package bancario;

public class ContaBancaria {
    private int num_conta;
    private String nomeTitular;
    private double saldo;

    public ContaBancaria() {
    }

    public ContaBancaria(double saldo, int numero_conta, String nomeTitular) {
        this.saldo = saldo;
        this.num_conta = numero_conta;
        this.nomeTitular = nomeTitular;
    }

    public void setTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getTitular() {
        return nomeTitular;
    }

    public int getNum_conta() {
        return num_conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        } else {
            System.out.println("Saldo insuficiente");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Número da conta: " + num_conta
                + "\nTitular: " + nomeTitular
                + "\nSaldo: R$ " + saldo;
    }
}
