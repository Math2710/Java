package constantes;
import java.util.Scanner;
public class Constantes {
    private static final double LARGURA = 10.0;
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.printf("Entre com o compprimento: ");
        double compr = entrada.nextDouble();

        double area = calcularArea(LARGURA, compr);
        System.out.println("A área é: " + area);

        entrada.close();
    }
    
    private static double calcularArea(double LARGURA, double compprimento) {
        return LARGURA * compprimento;
    }
    
}
