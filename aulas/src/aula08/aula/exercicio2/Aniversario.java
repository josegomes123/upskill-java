package aula08.aula.exercicio2;

public class Aniversario extends CartaoPresente {

    //Constructor
    public Aniversario(String destinatario){
        super(destinatario);
    }

    //Funcao
    public void showMessage(){
        System.out.println("Feliz Aniversario " + getDestinatario());
    }
}
