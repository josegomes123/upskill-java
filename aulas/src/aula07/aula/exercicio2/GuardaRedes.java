package aula07.aula.exercicio2;

public class GuardaRedes extends Jogador {
    //atributos
    private int golosSofridos;

    // Constructor, começa com 0 golos sofridos
    public GuardaRedes(int num, String nome){
        super(num, nome);
        this.golosSofridos = 0;
    }

    //Getters e Setters para golos sofridos
    public void setGolosSofridos(int golosSofridos) {
        this.golosSofridos = golosSofridos;
    }

    public int getGolosSofridos() {
        return golosSofridos;
    }

    @Override
    public String toString() {
        return super.getNome() + " Numero: " + super.getNum() + " Posiçao: Guarda Redes Golos Sofridos: " + golosSofridos + " Golos Marcados: " + super.getNumGolos();
    }
}
