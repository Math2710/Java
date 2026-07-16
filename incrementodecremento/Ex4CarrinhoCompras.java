package incrementodecremento;
import java.util.Scanner;
public class Ex4CarrinhoCompras {
    private static final double DESCONTO = 5.0;
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double subtotal = 0.0; int totalItens = 0;
        

        System.out.printf("Preço do item 1: ");
        double preco = scanner.nextDouble();
        totalItens++;
        subtotal+= preco;

        System.out.printf("Preço do item 2: ");
        preco = scanner.nextDouble();
        totalItens++;
        subtotal+= preco;

        System.out.printf("Preço do item 3: ");
        preco = scanner.nextDouble();
        totalItens++;
        subtotal+= preco - DESCONTO;

        System.out.println("Itens no carrinho: " + totalItens + "\nDesconto aplicado: R$" + DESCONTO + "\nTotal a pagar: R$" + subtotal);
    

        scanner.close();
    }
}
