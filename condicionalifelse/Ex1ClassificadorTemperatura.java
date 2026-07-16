package condicionalifelse;

import java.util.Scanner;

public class Ex1ClassificadorTemperatura {
    private static final int FRIO = 15;
    private static final int CALOR = 30;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Digite a temperatura: ");
        int temperatura = scanner.nextInt();
        String casaco = temperatura <= FRIO ? "Sim" : "Não";
        if (temperatura <= FRIO) {
            System.out.println("Está frio! \nLevar casaco? " + casaco); }
        else if (temperatura > FRIO && temperatura < CALOR) {
            System.out.println("Temperatura agradavel! \nLevar casaco? " + casaco);}
        else {
            System.out.println("Está calor \nLevar casaco? " +   casaco);}

        scanner.close();
    }

}
