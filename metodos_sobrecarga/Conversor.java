package metodos_sobrecarga;

public class Conversor {
    public double converter(double km) {
        return km * 1000;
    }

    public double converter(double metros, boolean paraKm) {
        if (paraKm){
            return metros / 1000;
        } else {
            return metros * 100;
        }
    }

    public void converter(int numero){
        if (numero == 0)
            System.out.println("Zero");
        else if (numero > 0)
            System.out.println("Positivo");
        else
            System.out.println("Negativo");

    }
}
