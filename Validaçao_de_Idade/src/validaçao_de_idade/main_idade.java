package validaçao_de_idade;

import java.util.Scanner;

public class main_idade {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Cria um objeto da sua classe 'idade'
        idade pessoa1 = new idade("Kelwin Imperador", 18);

        // Exibe os dados iniciais
        System.out.println("Olá, " + pessoa1.getNome() + "!");
        System.out.println("Sua idade atual é: " + pessoa1.getIdade());

        // Pergunta mim se quero alterar minha idade
        System.out.println("\nDeseja alterar sua idade? (S/N)");
        String resposta = scanner.next();

        if (resposta.equalsIgnoreCase("S")) {
            System.out.print("Digite sua nova idade: ");
            
            // Verifica se a entrada é um número inteiro válido
            if (scanner.hasNextInt()) {
                int novaIdade = scanner.nextInt();
                
                // 'setIdade' alterar a idade usando o método
                pessoa1.setIdade(novaIdade);
                
                // Exibe a idade atualizada (ou a mensagem de erro, se for inválida)
                System.out.println("\nIdade atualizada para: " + pessoa1.getIdade());
            } else {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
            }
        } else {
            System.out.println("Tudo bem! Sua idade não será alterada.");
        }

        scanner.close();
    }
}