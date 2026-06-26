package Random;
import java.util.Random;


public class ClassRandom {
	
	public static void main(String[] args) {
		Random aleatorio = new Random();
		float valor = aleatorio.nextFloat() * 100 + 1;
		System.out.println("Número gerado:" + valor);
		
	}

}
