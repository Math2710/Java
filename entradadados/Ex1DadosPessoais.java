package entradadados;
import java.util.Scanner;
public class Ex1DadosPessoais {
    public static void main(String[] args) {
        
        Scanner n1 = new Scanner(System.in);
        String nome; 
        System.out.println("Digite seu Nome: ");
        nome = n1.nextLine();

        System.out.println("Digite sua idade"); 
        int idade;
        idade = n1.nextInt();

        double altura;
        System.out.println("Digite sua altura");
        altura = n1.nextDouble();
        


        System.out.printf("Olá %s! você tem %d anos e %.2fm de altura.",nome, idade, altura);

        n1.close();

    }

    
}
