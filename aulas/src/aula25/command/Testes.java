package aula25.command;

public class Testes {

    public static void main(String[] args) {
        AparelhoEletronico tv = new TV();
        LigaTV ligaTV = new LigaTV(tv);

    }
}
