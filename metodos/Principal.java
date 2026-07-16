package metodos;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        String nomeAluno;
        int idadeAluno;
        Scanner entrada = new Scanner(System.in);

        MandaMensagem oi = new MandaMensagem();

        System.out.println("Entre com seu nome:");
        nomeAluno = entrada.nextLine();

        System.out.println("Entre com seu idade:");
        idadeAluno = entrada.nextInt();

        oi.mandaBoasVindas(nomeAluno, idadeAluno);
    

        entrada.close();
    }
}