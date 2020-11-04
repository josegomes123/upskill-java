package aula12.trabalho.exercicio4;

import static aula12.trabalho.exercicio4.Rank.*;

// Testes ex4 aula12
public class Testes {
    // Calcula total de pontos para um Array de cartas
    public static int calcularPontos(Rank[] listaCartas) {
        int totalPontos = 0;
        // For/each para percorrer a lista
        for (Rank carta : listaCartas) {
            // Adiciona os pontos de cada carta ao total
            totalPontos += carta.getPontos();
        }
        return totalPontos;
    }


    public static void main(String[] args) {
        // Obtem a lista de cartas completa
        Rank[] listaCompleta = Rank.values();
        // Imprime lista de cartas completa
        System.out.println("Lista completa de cartas / rank");
        for (Rank carta : listaCompleta) {
            System.out.println(carta.name() + ": " + carta.getPontos() + " pontos.");
        }
        System.out.println("------------------------------");
        // Cria lista nova
        Rank[] listaCartas = {Às, Manilha, Seis, Cinco}; // 11 + 10 pontos = 21
        System.out.println("A lista dada tem um total de " + calcularPontos(listaCartas) + " pontos.");
        // Testa outra lista
        Rank[] listaCartas1 = {Rei, Dama, Dama, Quatro}; // 4 + 2 + 2 = 8 pontos
        System.out.println("A lista dada tem um total de " + calcularPontos(listaCartas1) + " pontos.");
        System.out.println("------------------------------");
        System.out.println("Teste de erro / Lista com 5 cartas: ");
        // Bloco try/catch para testar o erro, assim dispara o erro mas o programa continua a executar e trata o erro
        try {
            // Testa lista com 5 cartas (para testar os erros)
            Rank[] listaCartas2 = {Rei, Rei, Dama, Dama, Quatro};
            if (listaCartas2.length > 4) {
                // Se a lista dada tiver mais de 4 cartas (porque nao se pode jogar mais por ronda) entao faz "throw" de um erro
                throw new IllegalStateException("Só pode jogar 4 quartas em cada ronda");
            } else {
                // Se a lista tiver dentro do limite calcula os pontos normalmente
                System.out.println("A lista dada tem um total de " + calcularPontos(listaCartas2) + " pontos.");
            }
            // "Apanha" o erro que fizemos throw por causa da lista ter 5 cartas
        } catch (IllegalStateException e) {
            // Imprime o erro na consola, no entanto o programa corre até ao fim normalmente e compila na mesma
            // Se testarmos este código sem o try/catch, ele vai dar o erro e terminar com "Process finished with exit code 1"
            // Com o try/catch ele dá o erro na mesma mas termina com "Process finished with exit code 0" , isto quer dizer que o programa correu normalmente e o erro foi "apanhado"
            e.printStackTrace();
        }
    }
}
