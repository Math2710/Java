package metodos;

public class Aluno {
    String nome;
    double nota1;
    double nota2;
    double nota3;
    
    public void exibirDados(){
        System.out.println("=== BOLETIM ===\nAluno: " + nome + "\nNota 1: " + nota1 + " | Nota 2: " + nota2 + " | Nota 3: " + nota3);
    }

    public void calcularMedia(){
        double media = (nota1 + nota2 + nota3) / 3;
        if (media >= 7){
            System.out.println("Situação: Aprovado");}
        else {
            System.out.println("Situação: Reprovado");}
    }
}
