package preço_protegido;

public class Produto {

    // Atributos privados
    private String nome;
    private double preco;

    // objeto Produto
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Método Gett pro atributo
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    // Método Set pra modificar os atributos
    public void setNome(String novoNome) {
        
        this.nome = novoNome;
    }

    public void setPreco(double novoPreco) {
        // Validação básica: garante que o preço não seja negativo
        if (novoPreco >= 0) {
            this.preco = novoPreco;
        } else {
            System.out.println("O preço não pode ser negativo cabaço.");
        }
    }
}