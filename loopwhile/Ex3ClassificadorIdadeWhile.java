package loopwhile;
import java.util.Scanner;
public class Ex3ClassificadorIdadeWhile {
    public static void main(String[] args) {
        Scanner i1 = new Scanner(System.in);
        System.out.printf("Digite a idade (-1 para sair): ");
        int idade = i1.nextInt();
        String msg;

        while (idade != -1) {
            msg = (idade >= 18) ? "Maior de idade" : "Menor de idade";
            System.out.printf(msg);
            System.out.printf("\nDigite a idade (-1 para sair): ");
            idade = i1.nextInt();
            
            
            
            
        }
    i1.close();
    }
}
