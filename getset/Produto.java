package getset;

public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }
    public int getEstoque(){
        return estoque;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPreco(double preco){
        if(preco < 0){
            System.out.println("Preço invalido!");
        } else {
             this.preco = preco;
        }
       
    }

    public void setEstoque(int estoque){
        if (estoque <= 0) {
            System.out.println("Estoque invalido!");
        } else{
            this.estoque = estoque;
        }
        
    }

    public void aplicarDesconto(double percentual){
        if (percentual <= 0 || percentual >= 100) {
            System.out.printf("Desconto de %.0f%%: Percentual inválido%n", percentual);
        } else {
            preco -= preco * (percentual / 100);
            System.out.printf("Desconto de %.0f%% aplicado!%n", percentual);
        }
    }

    public void exibirDados(){
        System.out.printf("Produto: %s%nPreço: %.2f%nEstoque: %d%n",
            nome,
            preco,
            estoque
        );
    }
}
