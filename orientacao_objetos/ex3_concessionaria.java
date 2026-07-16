package orientacao_objetos;

public class ex3_concessionaria {
    public static void main(String[] args) {
        
    
    Veiculo carro1 = new Veiculo();
    carro1.marca = "Toyota";
    carro1.modelo = "Corolla";
    carro1.cor = "Prata";
    carro1.ano = 2023;
    carro1.preco = 145000.00;
    carro1.disponivel = true;
    String statusCarro1 = carro1.disponivel ? "Disponível" : "Vendido";

    Veiculo carro2 = new Veiculo();
    carro2.marca = "Honda";
    carro2.modelo = "Civic";
    carro2.cor = "preto";
    carro2.ano = 2022;
    carro2.preco = 132000.00;
    carro2.disponivel = false;
    String statusCarro2 = carro2.disponivel ? "Disponível" : "Vendido";
    
    System.out.printf(
        "=== VEÍCULO 1 ===%n" +
        "Marca: %s%n" +
        "Modelo: %s%n" +
        "Cor: %s%n" +
        "Ano: %d%n" +
        "Preço: %f%n" +
        "Status: %s%n",
        carro1.marca,
        carro1.modelo,
        carro1.cor,
        carro1.ano,
        carro1.preco,
        statusCarro1);

    System.out.printf(
        "=== VEÍCULO 2 ===%n" +
        "Marca: %s%n" +
        "Modelo: %s%n" +
        "Cor: %s%n" +
        "Ano: %d%n" +
        "Preço: %f%n" +
        "Status: %s%n",
        carro2.marca,
        carro2.modelo,
        carro2.cor,
        carro2.ano,
        carro2.preco,
        statusCarro2);
    }
}
