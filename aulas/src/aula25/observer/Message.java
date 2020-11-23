package aula25.observer;

public class Message {
    private String mensagem;


    public Message(String mensagem){
        this.mensagem = mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }


    public String getMensagem() {
        return mensagem;
    }
}
