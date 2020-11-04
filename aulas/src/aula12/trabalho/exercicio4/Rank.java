package aula12.trabalho.exercicio4;

public enum Rank {
    // Crio o enumerador para cada carta com os respectivos pontos
    Às (11), Manilha(10) , Rei(4) , Valete(3) , Dama (2) , Dez(0),Nove (0),
    Oito (0),Seis (0),Cinco (0),Quatro (0),Três (0),Dois(0);
    private int pontos;


    //enum tem sempre constructor privado
    private Rank(int pontos){
        this.pontos = pontos;
    }

    //Getter
    public int getPontos() {
        return pontos;
    }

}
