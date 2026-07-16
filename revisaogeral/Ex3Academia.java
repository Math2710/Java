package revisaogeral;

import java.util.Scanner;

public class Ex3Academia {
    private static final double PLANO_BASIC = 59.90;
    private static final double PLANO_PRO = 99.90;
    private static final double PLANO_VIP = 149.90;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nome: ");
        String nome = sc.next();
        System.out.printf("Idade: ");
        int idade = sc.nextInt();
        System.out.printf("Peso (kg): ");
        Double peso = sc.nextDouble();
        System.out.printf("Altura (m): ");
        Double altura = sc.nextDouble();
        String msg;
        double icm = peso / (altura * altura);

        if (icm <= 18.5) {
            msg = "Abaixo do peso";

        }

        else if (icm < 18.5 && icm <= 25.0) {
            msg = "Peso normal";
        }
        else if (icm > 25.0 && icm <= 30.0) {
             msg = "Sobrepeso";
        }
        else {
             msg = "Obesidade";
        }
        String maior;
        maior = (idade >= 18) ? "Maior de idade? Sim" : "Maior de idade? Não";

        String plano;
        plano = (idade < 18 || idade > 60) ? "Plano recomendado: " + PLANO_BASIC : (icm <= 30) ? "Plano recomendado: " + PLANO_PRO : "Plano recomendado: " + PLANO_VIP;

        System.out.println("=== FICHA DO ALUNO ===");
        System.out.println("Nome: " + nome);
        System.out.println(maior);
        System.out.printf("ICM: %.2f - %s%n", icm, msg);
        System.out.println(plano);

        sc.close();
    }

}
