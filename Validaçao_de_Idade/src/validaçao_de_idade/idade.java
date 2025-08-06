package validaçao_de_idade;

public class idade {

    // Atributes
    private int idade;
    private String nome;

    // Construtor
    public idade(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Methods
    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int novaIdade) {
        if (novaIdade > 0) {
            this.idade = novaIdade;
        } else {
            System.out.println("Idade inválida. A idade deve ser um número positivo.");
        }
    }

    public void setNome(String novoNome) {
        if (novoNome != null && !novoNome.trim().isEmpty()) {
            this.nome = novoNome;
        } else {
            System.out.println("Nome inválido. O nome não pode ser nulo ou vazio.");
        }
    }
}