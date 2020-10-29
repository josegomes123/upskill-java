package aula08.aula.exercicio2;

public class Natal extends CartaoPresente {

    //Constructor
    public Natal(String destinatario){
        super(destinatario);
    }

    //Funcao
    public void showMessage(){
        System.out.println("Feliz Natal " + getDestinatario());
    }
}
