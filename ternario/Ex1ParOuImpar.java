package ternario;
import java.util.Scanner;
public class Ex1ParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int num = scanner.nextInt();
        String msg;

        msg = (num % 2 == 0) ? "par": "impar";
        System.out.println(num + " é " + msg);


        scanner.close();
    }
}
