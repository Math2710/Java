package operadoresrelacionais;
import java.util.Scanner;
public class Ex1ComparadorNumeros {
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
    System.out.printf("Digite o primeiro número: ");
    int numero1 = scanner.nextInt();

    System.out.printf("Digite o segundo número: ");
    int numero2 = scanner.nextInt();

    System.out.printf(numero1 + " == " + numero2 + "? %b", numero1 == numero2);
    System.out.printf("\n" + numero1 + " != " + numero2 + "? %b", numero1 != numero2);
    System.out.printf("\n" + numero1 + " > " + numero2 + "? %b ", numero1 > numero2);
    System.out.printf("\n" + numero1 + " < " + numero2 + "? %b", numero1 < numero2);
    System.out.printf("\n" + numero1 + " <= " + numero2 + "? %b", numero1 >= numero2);
    System.out.printf("\n" + numero1 + " => " + numero2 + "? %b", numero1 <= numero2);
    

    scanner.close();
    }
}
