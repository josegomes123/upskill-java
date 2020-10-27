package aula06.trabalho.exercicio2;

public class Testes {
    // Testes exercicio 2
    public static void main(String[] args) {
        // Cria musicas
        Musica musica1 = new Musica("Musica 1", 90);
        Musica musica2 = new Musica("Musica 2", 120);
        Musica musica3 = new Musica("Musica 3", 200);
        Musica musica4 = new Musica("Musica 4", 154);
        // Cria playlist
        Playlist playlist1 = new Playlist("Playlist 1 Teste");
        // Adiciona musicas à playlist
        playlist1.adicionarMusica(musica1);
        playlist1.adicionarMusica(musica2);
        playlist1.adicionarMusica(musica3);
        playlist1.adicionarMusica(musica4);
        // Imprime lista de musicas
        System.out.println("Lista de Musicas na playlist");
        playlist1.mostrarMusicas();
        // Remove musica da playlist
        playlist1.removerMusica(musica3);
        // Imprime Lista actualizada de musicas
        System.out.println("Lista de Musicas na playlist após remover musica3");
        playlist1.mostrarMusicas();
        //Calcula e imprime duraçao da playlist total
        int duracaoSeg = playlist1.calcDuration();
        System.out.println(duracaoSeg);
        // Para converter o total de segundos em Int num formato legivel de minutos e segundos
        int minutos = duracaoSeg/60;
        int segundos = duracaoSeg%60;
        System.out.println("A playlist tem duração de " + minutos + " minutos e " + segundos + " segundos ");
    }
}
