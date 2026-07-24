package getset;
import java.util.Scanner;
public class ex3_produto {
    public static void main(String[] args) {
        Produto produto = new Produto();
        Scanner scanner = new Scanner(System.in);
        double preco = -1;
        int estoque = -1;
        double desconto = -1;
        System.out.print("Produto: ");
        produto.setNome(scanner.nextLine());

        
        while (preco < 0) {
            System.out.print("Preço: ");
            preco = scanner.nextDouble();
            if(preco < 0){
                System.out.println("Preço inválido!");
            } else {
                produto.setPreco(preco);
            }
        }

        while (estoque < 0){
            System.out.print("Estoque: ");
            estoque = scanner.nextInt();
            if (estoque < 0){
                System.out.println("Estoque inválido");
            } else{
                produto.setEstoque(estoque);
            }
        }
        System.out.println("-------------------------------------");

        System.out.println("\n=== ANTES DO DESCONTO ===");
        produto.exibirDados();

        while(desconto < 0 || desconto > 100){
            System.out.print("Desconto: ");
            desconto = scanner.nextDouble();
            
            if(desconto < 0 || desconto > 100){
                produto.aplicarDesconto(desconto);
                } else {
                    produto.aplicarDesconto(desconto);
                }
            }

        System.out.println("\n=== APÓS O DESCONTO ===");
        produto.exibirDados();
        scanner.close();
    }
}
