package preço_protegido;

public class main_Produto {
    public static void main(String[] args) {
        // Cria um novo objeto Produto
        Produto p1 = new Produto("Laptop", 5500.00);

        // Acessa os dados usando os métodos getter
        System.out.println("Nome do produto: " + p1.getNome());
        System.out.println("Preço do produto: R$" + p1.getPreco());

        // Modifica o preço usando o método setter
        p1.setPreco(5250.00);
        System.out.println("\nPreço atualizado: R$" + p1.getPreco());
        
        // Tenta definir um preço inválido
        p1.setPreco(-100.00);
    }
}