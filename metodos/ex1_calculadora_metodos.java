package metodos;
import java.util.Scanner;
public class ex1_calculadora_metodos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora soma = new Calculadora();
        Calculadora menos = new Calculadora();
        Calculadora vezes = new Calculadora();
        Calculadora div = new Calculadora();

        System.out.println("Digite o primeiro número: ");
        double numero1 = sc.nextDouble();

        System.out.println("Digite o primeiro número: ");
        double numero2 = sc.nextDouble();

        soma.somar(numero1, numero2);
        menos.subtrair(numero1, numero2);
        vezes.multiplicar(numero1, numero2);
        div.dividir(numero1, numero2);



        sc.close();
    }
}
