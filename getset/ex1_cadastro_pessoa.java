package getset;
import java.util.Scanner;

public class ex1_cadastro_pessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        pessoa.setNome(scanner.nextLine());

        System.out.print("Idade: ");
        pessoa.setIdade(scanner.nextInt());

        System.out.print("Altura: ");
        pessoa.setAltura(scanner.nextDouble());

        pessoa.exibirDados();

        scanner.close();
    }
}