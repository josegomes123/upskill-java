package aula13.exercicio3;

public class Testes {

    public static void main(String[] args) {
        // Cria conta em branco
        ContaBancaria conta = new ContaBancaria();
        // Adiciona movimentos
        conta.adicionarMovimento("Roupa", 20.0);
        conta.adicionarMovimento("Comida", 33.5);
        conta.adicionarMovimento("Telemovel", 353.7);
        conta.adicionarMovimento("Renda", 500.0);
        conta.adicionarMovimento("Netflix", 9.0);
        // Imprime extrato (cria ficheiro com os movimentos)
        conta.criaFicheiro("extracto.txt");
        // Testar a criar conta a partir do ficheiro
        ContaBancaria conta1 = new ContaBancaria("extracto.txt");
        System.out.println("Teste Impressão e criaçao de conta a partir do ficheiro");
        System.out.println(conta1);
    }
}
