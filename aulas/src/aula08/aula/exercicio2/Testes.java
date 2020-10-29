package aula08.aula.exercicio2;

public class Testes {
    //Testes ex2 aula 8

    public static void main(String[] args) {
        // Crio os diferentes cartoes
        CartaoPresente aniversario = new Aniversario("André");
        CartaoPresente diadosnamorados = new DiaDosNamorados("Rute");
        CartaoPresente natal = new Natal("Rui");
        Natal natal1 = new Natal("Bianca");
        // Testo o metodo showMessage() para cada um dos cartoes
        aniversario.showMessage();
        diadosnamorados.showMessage();
        natal.showMessage();
        natal1.showMessage();
    }
}
