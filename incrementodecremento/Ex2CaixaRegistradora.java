package incrementodecremento;
import java.util.Scanner;
public class Ex2CaixaRegistradora {
    public static void main(String[] args) {
        double total = 0.0;
        int qtdItens = 0;

        Scanner scanner = new Scanner(System.in);
        
        System.out.printf("Preço do produto 1: " );
        double preco = scanner.nextDouble(); 
        total += preco;
        qtdItens++;

        System.out.printf("Preço do produto 2: " );
        preco = scanner.nextDouble(); 
        total += preco;
        qtdItens++;

        System.out.printf("Preço do produto 3: " );
        preco = scanner.nextDouble(); 
        total += preco;
        qtdItens++;


        System.out.println("Itens: " + qtdItens + " | Total: R$ " + total);


        scanner.close();


    }
}
