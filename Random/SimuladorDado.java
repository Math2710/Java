package Random;

import java.util.Random;

public class SimuladorDado {

    public static void main(String[] args) {
        Random aleatorio = new Random();

        int Dado1 = aleatorio.nextInt(6) + 1;
        int Dado2 = aleatorio.nextInt(6) + 1;
        int Dado3 = aleatorio.nextInt(6) + 1;
        int Dado4 = aleatorio.nextInt(6) + 1;
        int Dado5 = aleatorio.nextInt(6) + 1;
        int Dado6 = aleatorio.nextInt(6) + 1;
        int Dado7 = aleatorio.nextInt(6) + 1;
        int Dado8 = aleatorio.nextInt(6) + 1;
        int Dado9 = aleatorio.nextInt(6) + 1;
        int Dado10 = aleatorio.nextInt(6) + 1;

        int quantidade1 = 0;
        int quantidade2 = 0;
        int quantidade3 = 0;
        int quantidade4 = 0;
        int quantidade5 = 0;
        int quantidade6 = 0;

        if (Dado1 == 1) {
            quantidade1++;
        } else if (Dado1 == 2) {
            quantidade2++;
        } else if (Dado1 == 3) {
            quantidade3++;
        } else if (Dado1 == 4) {
            quantidade4++;
        } else if (Dado1 == 5) {
            quantidade5++;
        } else if (Dado1 == 6) {
            quantidade6++;
        }

        if (Dado2 == 1) {
            quantidade1++;
        } else if (Dado2 == 2) {
            quantidade2++;
        } else if (Dado2 == 3) {
            quantidade3++;
        } else if (Dado2 == 4) {
            quantidade4++;
        } else if (Dado2 == 5) {
            quantidade5++;
        } else if (Dado2 == 6) {
            quantidade6++;
        }

        if (Dado3 == 1) {
            quantidade1++;
        } else if (Dado3 == 2) {
            quantidade2++;
        } else if (Dado3 == 3) {
            quantidade3++;
        } else if (Dado3 == 4) {
            quantidade4++;
        } else if (Dado3 == 5) {
            quantidade5++;
        } else if (Dado3 == 6) {
            quantidade6++;
        }

        if (Dado4 == 1) {
            quantidade1++;
        } else if (Dado4 == 2) {
            quantidade2++;
        } else if (Dado4 == 3) {
            quantidade3++;
        } else if (Dado4 == 4) {
            quantidade4++;
        } else if (Dado4 == 5) {
            quantidade5++;
        } else if (Dado4 == 6) {
            quantidade6++;
        }

        if (Dado5 == 1) {
            quantidade1++;
        } else if (Dado5 == 2) {
            quantidade2++;
        } else if (Dado5 == 3) {
            quantidade3++;
        } else if (Dado5 == 4) {
            quantidade4++;
        } else if (Dado5 == 5) {
            quantidade5++;
        } else if (Dado5 == 6) {
            quantidade6++;
        }

        if (Dado6 == 1) {
            quantidade1++;
        } else if (Dado6 == 2) {
            quantidade2++;
        } else if (Dado6 == 3) {
            quantidade3++;
        } else if (Dado6 == 4) {
            quantidade4++;
        } else if (Dado6 == 5) {
            quantidade5++;
        } else if (Dado6 == 6) {
            quantidade6++;
        }

        if (Dado7 == 1) {
            quantidade1++;
        } else if (Dado7 == 2) {
            quantidade2++;
        } else if (Dado7 == 3) {
            quantidade3++;
        } else if (Dado7 == 4) {
            quantidade4++;
        } else if (Dado7 == 5) {
            quantidade5++;
        } else if (Dado7 == 6) {
            quantidade6++;
        }

        if (Dado8 == 1) {
            quantidade1++;
        } else if (Dado8 == 2) {
            quantidade2++;
        } else if (Dado8 == 3) {
            quantidade3++;
        } else if (Dado8 == 4) {
            quantidade4++;
        } else if (Dado8 == 5) {
            quantidade5++;
        } else if (Dado8 == 6) {
            quantidade6++;
        }

        if (Dado9 == 1) {
            quantidade1++;
        } else if (Dado9 == 2) {
            quantidade2++;
        } else if (Dado9 == 3) {
            quantidade3++;
        } else if (Dado9 == 4) {
            quantidade4++;
        } else if (Dado9 == 5) {
            quantidade5++;
        } else if (Dado9 == 6) {
            quantidade6++;
        }

        if (Dado10 == 1) {
            quantidade1++;
        } else if (Dado10 == 2) {
            quantidade2++;
        } else if (Dado10 == 3) {
            quantidade3++;
        } else if (Dado10 == 4) {
            quantidade4++;
        } else if (Dado10 == 5) {
            quantidade5++;
        } else if (Dado10 == 6) {
            quantidade6++;
        }

        System.out.println("1 apareceu " + quantidade1 + " vezes");
        System.out.println("2 apareceu " + quantidade2 + " vezes");
        System.out.println("3 apareceu " + quantidade3 + " vezes");
        System.out.println("4 apareceu " + quantidade4 + " vezes");
        System.out.println("5 apareceu " + quantidade5 + " vezes");
        System.out.println("6 apareceu " + quantidade6 + " vezes");

    }
}
