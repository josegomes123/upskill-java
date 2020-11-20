package aula07.exercicio2;

public class Testes {
    // Testes Ex2
    public static void main(String[] args) {
        //Crio Jogadores
        JogadorDeCampo jogador1 = new JogadorDeCampo(7, "Ronaldo");
        GuardaRedes guardaRedes1 = new GuardaRedes(1, "Rui Patricio");
        JogadorDeCampo jogador2 = new JogadorDeCampo(5, "Pepe");
        // Atribuir valores ao guarda redes
        guardaRedes1.setGolosSofridos(3);
        guardaRedes1.setNumGolos(2);
        //Atribuir valores ao jogador
        jogador1.setNumGolos(6);
        jogador1.setPassesFeitos(4);
        jogador1.setPassesRecebidos(5);
        // Testes dos atributos com toString
        System.out.println("Jogadores Criados: ");
        System.out.println(jogador1.toString());
        System.out.println(guardaRedes1.toString());
        System.out.println(jogador2.toString());

    }

}