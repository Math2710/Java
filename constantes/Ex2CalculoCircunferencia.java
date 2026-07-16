package constantes;
import java.util.Scanner;
public class Ex2CalculoCircunferencia {
    private static double PI = 3.14159;
    public static void main(String[] args) {
        Scanner c1 = new Scanner(System.in);
        System.out.printf("Digite o raio do cículo: ");
        double raio = c1.nextDouble();

        double Clc_circuferencia = 2 * PI * raio;
        double calcular_area = PI * Math.pow(raio, 2);

        System.out.println("Circunferência: " + Clc_circuferencia);
        System.out.println("Área: " + calcular_area);
        

        c1.close();
    }
    
}
