package operadoresrelacionais;
import java.util.Scanner;
public class Ex3ComparadorPreco {
    private static final double PRECO_LIMITE = 50.0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Preço do produto 1: ");
        double produto1 = scanner.nextDouble();

        System.out.printf("Preço do produto 2: ");
        double produto2 = scanner.nextDouble();

        System.out.printf("Produto 1 está dentro do limite? %b", produto1 <= PRECO_LIMITE);
        System.out.printf("\nProduto 2 está dentro do limite? %b", produto2 <= PRECO_LIMITE);
         System.out.printf("\nProduto 1 é mais barato que o produto 2? %b", produto1 < produto2);
         System.out.printf("\nOs preços são iguais? %b", produto1 == produto2);

        scanner.close();
    }
    
}
