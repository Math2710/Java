package getset;

public class ContaBancaria {
    private String titular;
    private String numeroConta;
    private double saldo;

    public String getTitular(){
        return titular;
    }
    public String getNumeroConta(){
        return numeroConta;
    }
    public double getSaldo(){
        return saldo;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }
    public void setNumeroConta(String numeroConta){
        this.numeroConta = numeroConta;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.printf("Depósito de R$ %.2f: Valor inválido!", valor);
        } else {
            System.out.printf("\nDeposito de R$ %.2f realizado!", valor);
            this.saldo += valor;
        }
    }

    public void sacar(double valor){
        if(valor > saldo){
            System.out.printf("\nSaque de R$ %.2f: Saldo insulficiente", valor);
        } else {
            System.out.printf("\nSaque de R$ %.2f realizado!", valor);
            saldo -= valor;
        }
    }

    public void exibirDados(){
        System.out.printf("=== CONTA BANCÁRIA ===\nTitular: %s\nConta: %s\nSaldo: R$%.2f",
        titular,
        numeroConta,
        saldo
        );
    }
}
