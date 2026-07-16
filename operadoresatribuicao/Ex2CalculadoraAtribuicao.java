package operadoresatribuicao;

import java.util.Scanner;

public class Ex2CalculadoraAtribuicao {
    public static void main(String[] args) {
        Scanner n1 = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = n1.nextDouble();

        System.out.printf("O número digitado foi: %.2f%n", numero);

        numero += 10;
        System.out.printf("O número + 10 é = %.2f%n", numero);

        numero -= 5;
        System.out.printf("O número - 5 é = %.2f%n", numero);

        numero *= 2;
        System.out.printf("O número multiplicado por 2 é = %.2f%n", numero);

        numero /= 3;
        System.out.printf("O número dividido por 3 é = %.2f%n", numero);

        numero %= 7;
        System.out.printf("A sobra do número dividido por 7 é = %.2f%n", numero);

        n1.close();
    }
}
