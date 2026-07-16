package condicionalifelse;

import java.util.Scanner;

public class CondicionalIfElse {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double LivroLinux;
        double LivroJava;

        System.out.println("Entre com o preço do livro Linux: ");
        LivroLinux = entrada.nextDouble();
        System.out.println("Entre com o preço do livro Java: ");
        LivroJava = entrada.nextDouble();

        double total = LivroLinux + LivroJava;
        System.out.println("O preço total é " + total);

        if (LivroLinux == 10) {
            System.out.println("Livro de Linux quase de graça!\n");
        }
        if (total <= 120.00) {
            System.out.println("O preço está bom!");
        } else {
            System.out.println("Livros muito caros!");
        }
        entrada.close();
    }

}
