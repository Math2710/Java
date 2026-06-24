package Scanner;
import java.util.Scanner;
public class ex3_cadastro_produto {
    public static void main(String[] args){
        Scanner n1 = new Scanner(System.in);
        String produto;
        System.out.printf("Digite o nome do produto: ");
        produto = n1.nextLine();

        Scanner p1 = new Scanner(System.in);
        double preco;
        System.out.printf("Digite o valor desse produto: ");
        preco = p1.nextFloat();

        Scanner d1 = new Scanner(System.in);
        double desconto;
        System.out.printf("Digite a porcetagem de desconto que será aplicada no produto: ");
        desconto = d1.nextFloat();

        double pctg_dct = desconto / 100.0;
        double valorFinal = preco * (1 - pctg_dct);

        System.out.println("Nome do produto: " + produto + "\nPreço original: " + preco + "\nDesconto (%): " + desconto + "\nPreço final: " + valorFinal);


        d1.close();
        n1.close();
        p1.close();
    }
}
