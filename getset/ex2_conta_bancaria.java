package getset;

public class ex2_conta_bancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.setTitular("Carlos");
        conta.setNumeroConta("98765-4");
        conta.setSaldo(1000.00);

        conta.exibirDados();

        System.out.println("\n-------------------------------------");

        conta.depositar(-50.0);
        conta.depositar(500.0);

        conta.sacar(2000.0);
        conta.sacar(300.0);

        
        System.out.println("\n-------------------------------------");

        System.out.printf("Saldo final: R$ %.2f", conta.getSaldo());



    }
}
