package Random;

import java.util.Random;

public class Media {

    public static void main(String[] args) {
        Random aleatorios = new Random();
        int numero1 = aleatorios.nextInt(101);
        int numero2 = aleatorios.nextInt(101);
        int numero3 = aleatorios.nextInt(101);
        int numero4 = aleatorios.nextInt(101);
        int numero5 = aleatorios.nextInt(101);

        int total = (numero1 + numero2 + numero3 + numero4 + numero5);
        double media = total / 5.0;

        System.out.println("Números: " + numero1 + ", " + numero2 + ", " + numero3 + ", " + numero4 + ", " + numero5 + " | Média: " + media );






        

    }

}
