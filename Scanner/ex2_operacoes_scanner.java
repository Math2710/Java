package Scanner;
import java.util.Scanner;
public class ex2_operacoes_scanner {
    public static void main(String[] args) {
        Scanner n1 = new Scanner(System.in);
        double numero;
        double numero2;
        System.out.println("Digite um numero: ");
        numero = n1.nextInt();
        System.out.println("Digite outro numero: ");
        numero2 = n1.nextInt();

        double soma = numero + numero2;
        double subtracao = numero - numero2;
        double multiplicacao = numero * numero2;
        double divisao = numero / numero2;


        System.out.println(numero + " + " + numero2 + " = " + soma);
        System.out.println(numero + " - " + numero2 + " = " + subtracao);
        System.out.println(numero + " vezes " + numero2 + " = "  + multiplicacao);
        System.out.println(numero + " dividido por " + numero2 + " = " + divisao);

        n1.close();
    }
}
