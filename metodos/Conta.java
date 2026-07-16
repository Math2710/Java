package metodos;

public class Conta {
    String titular;
    String numeroConta;
    double saldo;

    public void exibirSaldo(){
        System.out.println("=== CONTA BANCÁRIA ===\nTitular: " + titular + "\nConta: " + numeroConta + "\nSaldo: " + saldo);
    }

    public void depositar(double valor){
        
        saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado!");
    }

    public void sacar(double valor){
        if (valor > saldo)
            System.out.println("Saldo insuficiente!");
        else{
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado!");
        }
    }
}
