package ternario;
import java.util.Scanner;
public class Ex3MaiorEntreDois {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg;
        System.out.printf("Digite um número inteiro: ");
        int numero1 = sc.nextInt();
        System.out.printf("Digite outro número inteiro: ");
        int numero2 = sc.nextInt();
        
        msg = (numero1 > numero2) ? numero1 + " é o maior" : (numero1 < numero2) ? numero2 + " é o maior" : "Os dois números são iguais";

        System.out.println(msg);


        sc.close();
    }
}
