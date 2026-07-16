package metodos;

public class Calculadora {
    public void somar(double a, double b){
        double somar = a + b;
        System.out.println(a + " + " + b + " = " + somar);
    }

    public void subtrair(double a, double b){
        double subtrair = a - b;
        System.out.println(a + " - " + b + " = " + subtrair);
}

    public void multiplicar(double a, double b){
        double multiplicar = a * b;
        System.out.println(a + " / " + b + " = " + multiplicar);
    }

    public void dividir(double a, double b){
        double dividir = a / b;
        System.out.println(a + " / " + b + " = " + dividir);
    }
    
}
