package metodos_sobrecarga;

public class Impressora {
    public static void imprimir(String texto){
        System.out.println(texto);
    }
    
    public static void imprimir(String texto, int vezes){
        int a = 0; 
        while(a < vezes){
            System.out.println("Olá mundo");
            a ++;
        }
    }

    public static void imprimir(String texto, boolean maiusculo){
        if(maiusculo)
            System.out.println(texto.toUpperCase());
        else
            System.out.println(texto.toLowerCase());
    }
}
    