package aula25.command;

public class LigaTV implements Command {
    private AparelhoEletronico aparelhoEletronico;


    public LigaTV(AparelhoEletronico aparelhoEletronico){
        aparelhoEletronico.on();
    }


    @Override
    public void execute() {
        aparelhoEletronico.on();
    }

    @Override
    public void desfaz() {
        aparelhoEletronico.off();
    }
}
