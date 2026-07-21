package metodos_sobrecarga;

public class ex1_impressora {

    public static void main(String[] args) {

        Impressora impressora = new Impressora();

        System.out.println("1º método:");
        impressora.imprimir("Olá Mundo");

        System.out.println("\n2º método:");
        impressora.imprimir("Olá Mundo", 3);

        System.out.println("\n3º método:");
        impressora.imprimir("Olá Mundo", true);
    }
}