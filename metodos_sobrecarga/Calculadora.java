package metodos_sobrecarga;

public class Calculadora {
    public static void somar(double a, double b){
        double soma = a + b;
        System.out.println("Soma de dois: " + soma);
    }

    public static void somar(double a, double b, double c){
        double soma = a + b + c;
        System.out.println("Soma de três: " + soma);
    }

    public static void somar(String a, String b){
        System.out.println("Concatenado: " + a  + " " + b);
    }

}
