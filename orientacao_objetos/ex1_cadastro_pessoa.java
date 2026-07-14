package orientacao_objetos;

public class ex1_cadastro_pessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Ana Silva";
        pessoa.cpf = "123.456.789-00";
        pessoa.idade = 28;
        pessoa.altura = 1.65;
        pessoa.peso = 62.0;

        System.out.printf("=== CADASTRO DE PESSOA ===\nNome: %s", pessoa.nome);
        System.out.printf("CPF: %s", pessoa.cpf);
        System.out.printf("\nIdade: %d", pessoa.idade);
        System.out.printf("\nAltura: %.2f", pessoa.altura);
        System.out.printf("\nPeso: %.2f", pessoa.peso);
    }
}
