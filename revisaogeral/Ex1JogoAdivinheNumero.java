package revisaogeral;

import java.util.Scanner;
import java.util.Random;

public class Ex1JogoAdivinheNumero {
    private static final int TENTATIVAS_MAX = 5;

    public static void main(String[] args) {
        Random number = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.printf("Adivinhe o número (1 a 50): ");
        int advinhado = sc.nextInt();
        int aleatorio = number.nextInt(50) + 1;
        String msg;
        int tentativas = 0;

        while (advinhado != aleatorio && tentativas < TENTATIVAS_MAX) {
            tentativas++;

            if (advinhado < aleatorio) {
                System.out.println("Muito baixo!");
            } else if (advinhado > aleatorio) {
                System.out.println("Muito alto!");
            } else {
                System.out.println("Acertou!");
            }

            if (advinhado != aleatorio && tentativas < TENTATIVAS_MAX) {
                System.out.printf("Adivinhe o número (1 a 50): ");
                advinhado = sc.nextInt();
            }
        }
        msg = (advinhado == aleatorio) ? "Você venceu!" : "Você perdeu!";
        System.out.println("Tentativas usadas: " + tentativas + " de 5");
        System.out.println(msg);
        sc.close();
    }
}