package metodos_sobrecarga;
import java.util.Scanner;
public class ex3_conversor {
    public static void main(String[] args) {
        Conversor conversor = new Conversor();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite km para converter: ");
        double km = scanner.nextDouble();
        System.out.println(km + " km = " + conversor.converter(km) + " metros");

        System.out.println("Digite metros: ");
        double metros = scanner.nextDouble();
        System.out.println("Converter para km? (true/false): ");
        boolean paraKm = scanner.nextBoolean();
        System.out.println(metros + " metros = " + conversor.converter(metros, paraKm));

        System.out.println("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        conversor.converter(numero);
        scanner.close();
    }
}
