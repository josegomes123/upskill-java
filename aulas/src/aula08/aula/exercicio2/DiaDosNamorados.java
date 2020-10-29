package aula08.aula.exercicio2;

public class DiaDosNamorados extends CartaoPresente {

    //Constructor
    public DiaDosNamorados(String destinatario){
        super(destinatario);
    }

    //Funcao
    public void showMessage(){
        System.out.println("Feliz Dia dos Namorados " + getDestinatario());
    }
}
