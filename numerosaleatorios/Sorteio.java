package numerosaleatorios;
import java.util.Random;
public class Sorteio {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        int numero = aleatorio.nextInt(10) + 1;

        System.out.println("Número sorteado: " + numero);




    }
    
}
