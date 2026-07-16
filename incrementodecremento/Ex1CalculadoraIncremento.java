package incrementodecremento;
import java.util.Scanner;

public class Ex1CalculadoraIncremento {
    public static void main(String[] args) {
        Scanner a1 = new Scanner(System.in);
        System.out.printf("Digite um número inteiro: ");
        int num = a1.nextInt();

        System.out.println("Número digitado: " + num);
        num++;
        System.out.println("Após num++  -> num: " + num);
        ++num;
        System.out.println("Após ++num  -> num: " + num);
        num--;
        System.out.println("Após num--  -> num: " + num);
        --num;
        System.out.println("Após --num  -> num: " + num);

    
        a1.close();
    }
    
}
