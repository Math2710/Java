package metodos_sobrecarga;
import java.util.Scanner;
public class ex2_calculadora_sobrecarga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite dois numeros: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        Calculadora.somar(num1, num2);

        System.out.println("Digite um terceiro:");
        double num3 = scanner.nextDouble();
        Calculadora.somar(num1, num2, num3);

        System.out.println("Digite duas palavras: ");
        String word1 = scanner.next();
        String word2 = scanner.next();
        Calculadora.somar(word1, word2);



        scanner.close();
    }
}
