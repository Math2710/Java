package revisaogeral;

import java.util.Scanner;

public class Ex2CaixaEletronico {
    private static final double SALDO_INICIAL = 1000.0;
    private static final double LIMITE_SAQUE = 500.0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldo = SALDO_INICIAL;
        int operacoes = 0;
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\n=== CAIXA ELETRÔNICO ===");
            System.out.printf("Saldo atual: R$ %.2f%n", saldo);
            System.out.println("1 - Depositar | 2 - Sacar | 3 - Ver saldo | 4 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.print("Valor do depósito: R$ ");
                double deposito = sc.nextDouble();

                saldo += deposito;
                operacoes++;

                System.out.printf("Depósito realizado! Saldo: R$ %.2f%n", saldo);

            } else if (opcao == 2) {
                System.out.print("Valor do saque: R$ ");
                double saque = sc.nextDouble();

                if (saque > LIMITE_SAQUE) {
                    System.out.printf("Limite por saque: R$ %.2f%n", LIMITE_SAQUE);
                } else if (saque > saldo) {
                    System.out.println("Saldo insuficiente!");
                } else {
                    saldo -= saque;
                    operacoes++;

                    System.out.printf("Saque realizado! Saldo: R$ %.2f%n", saldo);
                }

            } else if (opcao == 3) {
                System.out.printf("Saldo atual: R$ %.2f%n", saldo);

            } else if (opcao == 4) {
                System.out.println("-------------------------------------");

            } else {
                System.out.println("Opção inválida!");
            }
        }

        String status = saldo > 0 ? "Status: Saldo positivo" : "Status: Saldo zerado";

        System.out.println("Operações realizadas: " + operacoes);
        System.out.println(status);
        System.out.println("Até logo!");

        sc.close();
    }
}