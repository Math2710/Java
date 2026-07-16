package incrementodecremento;

public class Ex3PrePosIncremento {
    public static void main(String[] args) {
        int a = 5; int b = a++; 

        System.out.println("b = a++ -> a: " + a + " | b: " + b);

        a = 5; b = ++a;

        System.out.println("b = ++a -> a: " + a + " | b: " + b);
    }    
}
