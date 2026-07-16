package metodos;
import java.util.Scanner;
public class Ex3BancoMetodos {
    public static void main(String[] args) {
        Conta conta = new Conta();
        Scanner scanner = new Scanner(System.in);

        conta.titular = "Ana Lima";
        conta.numeroConta = "12345-6";
        conta.saldo = 500.00;

        conta.exibirSaldo();

        System.out.println("-------------------------------------");
        System.out.println("Valor para depósito: ");
        double deposito = scanner.nextDouble();
        conta.depositar(deposito);

        System.out.println("-------------------------------------");
        System.out.println("Valor para saque: ");
        double saque = scanner.nextDouble();
        conta.sacar(saque);
        
         System.out.println("-------------------------------------");
        System.out.println("Valor para saque: ");
        saque = scanner.nextDouble();
        conta.sacar(saque);

        System.out.println("-------------------------------------");
        System.out.println("Saldo final: R$" + conta.saldo);

        scanner.close();
    }
    
}
