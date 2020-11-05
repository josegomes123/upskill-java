package aula07.exercicio2;

public class JogadorDeCampo extends Jogador {
    //atributos da subclasse
    private int passesFeitos;
    private int passesRecebidos;

    // Constructor, inicializa passes a 0
    public JogadorDeCampo(int num, String nome){
        super(num, nome);
        this.passesFeitos = 0;
        this.passesRecebidos = 0;
    }

    // Getters e Setters
    public int getPassesFeitos() {
        return passesFeitos;
    }

    public int getPassesRecebidos() {
        return passesRecebidos;
    }

    public void setPassesFeitos(int passesFeitos) {
        this.passesFeitos = passesFeitos;
    }
    public void setPassesRecebidos(int passesRecebidos) {
        this.passesRecebidos = passesRecebidos;
    }


    @Override
    public String toString() {
        return super.getNome() + " Numero: " + super.getNum() + " Posiçao: Jogador De Campo Passes Feitos: " + passesFeitos +
                " Passes Recebidos: " + passesRecebidos +
                " Golos Marcados: " + super.getNumGolos();
    }
}
