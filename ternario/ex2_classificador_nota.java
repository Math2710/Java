package ternario;
import java.util.Scanner;
public class ex2_classificador_nota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite a nota: ");
        double nota = sc.nextDouble();
        String msg;

        msg = (nota >= 7) ? "Aprovado" : "Reprovado";
        System.out.println(msg);


        sc.close();
    }
}
