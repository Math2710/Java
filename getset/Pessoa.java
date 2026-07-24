package getset;
public class Pessoa {

    private String nome;
    private int idade;
    private double altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Idade inválida!");
        } else {
            this.idade = idade;
        }
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura){
        if (altura <= 0){
            System.out.println("Altura inválida");
        } else {
            this.altura = altura;
        }
    }

    public void exibirDados() {
    System.out.println("-------------------------------------");
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
    System.out.println("Altura: " + altura + "m");
}
}