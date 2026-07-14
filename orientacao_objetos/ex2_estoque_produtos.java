package orientacao_objetos;

public class ex2_estoque_produtos {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        Produto produto3 = new Produto();

        produto1.nome = "Arroz";
        produto1.categoria = "Alimento";
        produto1.preco = 8.90;
        produto1.estoque = 50;
        produto1.codBarra = "7891234567890";

        
        produto2.nome = "Notebook";
        produto2.categoria = "Eletrônicos";
        produto2.preco = 3500.00;
        produto2.estoque = 8;
        produto2.codBarra = "7899876543210";

        
        produto3.nome = "Camiseta";
        produto3.categoria = "Roupas";
        produto3.preco = 59.90;
        produto3.estoque = 25;
        produto3.codBarra = "7894561237890";

        System.out.printf(
            "=== PRODUTO 1 ===%n" +
            "Nome: %s%n" +
            "Categoria: %s%n" +
            "Preço: R$ %.2f%n" +
            "Estoque: %d unidades%n" +
            "Cód. Barras: %s%n" +
            "=================%n",
            produto1.nome,
            produto1.categoria,
            produto1.preco,
            produto1.estoque,
            produto1.codBarra
            );

        System.out.printf(
            "=== PRODUTO 2 === %n" +
            "Nome: %s%n" +
            "Categoria: %s%n" +
            "Preço: %.2f%n" +
            "Estoque: %d%n" +
            "Cód. Barras: %s%n" +
            "=================%n",
            produto2.nome,
            produto2.categoria,
            produto2.preco,
            produto2.estoque,
            produto2.codBarra
        );

            System.out.printf(
            "=== PRODUTO 3 === %n" +
            "Nome: %s%n" +
            "Categoria: %s%n" +
            "Preço: %.2f%n" +
            "Estoque: %d%n" +
            "Cód. Barras: %s%n",
            produto3.nome,
            produto3.categoria,
            produto3.preco,
            produto3.estoque,
            produto3.codBarra
        );  
    }
}
