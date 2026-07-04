package loopwhile;
import java.util.Scanner;
public class Principal {  
    public static void main(String[] args) {
        // int contador = 1;
        // while (contador <= 50) {
        //     System.out.println(contador);
        //     contador++;
        // }

        Scanner entrada = new Scanner(System.in);
        String nome;
        System.out.printf("Digite seu nome ou s para sair: ");
        nome = entrada.nextLine();
        while (!nome.equals("s")) {
            System.out.printf("Bem-vindo %s\n", nome);
            System.out.println("Digite seu nome ou s para sair: ");
            nome = entrada.nextLine();

        }
    System.out.println("Fim da exercução!");
        
    entrada.close();
    }
    
}
