package aula08.aula.exercicio2;

 /*Escreva uma classe abstrata chamada CartaoPresente. Essa classe representa todos os tipos de cartões presente e
conterá apenas um atributo: destinatario (tipo String).
Nessa classe, deverá também ser declarado o método public abstract void showMessage().
Crie classes filhas da classe CartaoPresente: DiaDosNamorados, Natal e Aniversário. Cada uma dessas classes deve
conter um método construtor que receba o nome do destinatário do cartão. Cada classe também deverá
implementar o método showMessage(), mostrando uma mensagem ao usuário com seu nome e que seja específica
para a data de comemorativa do cartão.
Crie uma classe Teste com um método main onde são criadas instâncias dos 3 tipos de cartões. Depois, exiba as
mensagens desse cartão chamando o método showMessage().*/


public abstract class CartaoPresente {
    //Atributo
    private String destinatario;

    //Constructor
    public CartaoPresente(String destinatario){
        this.destinatario = destinatario;
    }

    // Funcao a implementar nas subclasses
    public abstract void showMessage();

    // Getter
    public String getDestinatario() {
        return destinatario;
    }
}
