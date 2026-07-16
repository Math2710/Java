package metodos;
import java.util.Scanner;
public class Ex2BoletimAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.printf("Nome do aluno: ");
        aluno.nome = sc.nextLine();

        System.out.printf("Nota 1: ");
        aluno.nota1 = sc.nextDouble();
        
        System.out.printf("Nota 2: ");
        aluno.nota2 = sc.nextDouble();

        System.out.printf("Nota 3: ");
        aluno.nota3 = sc.nextDouble();
        

        aluno.exibirDados();
        aluno.calcularMedia();


        sc.close();
    }
    
}
