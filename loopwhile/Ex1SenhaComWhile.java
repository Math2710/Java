package loopwhile;
import java.util.Scanner;
public class Ex1SenhaComWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite a senha: ");
        String digitado = sc.next();
        
        while(!digitado.equals ("java123")) {
            System.out.println("Senha incorreta, tente novamente.");
            digitado = sc.next();
        }
        System.out.println("Acesso permitido");
        sc.close();
    }
}
