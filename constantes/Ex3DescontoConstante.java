package constantes;
import java.util.Scanner;
public class Ex3DescontoConstante {
    private static final double DESCONTO = 0.20;
    public static void main(String[] args) {
        Scanner n1 = new Scanner(System.in);
        System.out.printf("Digite o nome do produto: ");
        String produto = n1.nextLine();
        
        Scanner p1 = new Scanner(System.in);
        System.out.printf("Digite o preço do produto: ");
        double preco = p1.nextDouble();

        double desconto = preco * DESCONTO;
        double preco_final =  preco - desconto;

        System.out.println("Produto: " + produto + "\nDesconto (20%): R$" + desconto + "\nPreço final: R$" + preco_final);

        n1.close();
        p1.close();
    }
    
}
