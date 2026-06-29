package OperadoresRelacionais;
import java.util.Scanner;

public class ex2_validador_idade {
    private static final int MAIORIDADE = 18;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Digite sua idade: ");
        int idade = scanner.nextInt();
        
        System.out.printf("Tem 18 anos exatos? %b", idade == MAIORIDADE);
        System.out.printf("\nÉ maior de idade? %b", idade > MAIORIDADE);
        System.out.printf("\nÉ menor de idade? %b", idade < MAIORIDADE);
        System.out.printf("\nTem pelo menos 16? %b", idade >= 16);
        System.out.printf("\nTem no máximo 18 anos? %b", idade <= MAIORIDADE);

        scanner.close();
    }
    
}
