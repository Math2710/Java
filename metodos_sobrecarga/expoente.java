package metodos_sobrecarga;

public class expoente {

    public static void elevar() {
        System.out.println("Este método não calcula nada!");
    }

    public static double elevar(double i) {
        return i * i;
    }
    

    public static double elevar(double i, double j) {
        return Math.pow(i, j);
    }

}
