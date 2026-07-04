package loopwhile;
import java.util.Scanner;
public class ex2_maior_numero_ate_zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número (0 para sair): ");
        int numero = sc.nextInt();
        int maior = 020;
        while (numero != 0) {
            maior = numero > maior ? numero : maior;
            System.out.println("Digite um número (0 para sair): ");
            numero = sc.nextInt();
            maior = numero > maior ? numero : maior;
            
        }
    System.err.println("Maior número digitado: " + maior);
    sc.close();
    }
}
