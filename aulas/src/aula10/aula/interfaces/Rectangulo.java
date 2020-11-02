package aula10.aula.interfaces;

public class Rectangulo implements FiguraGeometricaPlana {
    private int comprimento;
    private int largura;

    public Rectangulo(int comprimento, int largura){
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public int getComprimento() {
        return comprimento;
    }
    public int getLargura() {
        return largura;
    }
    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }
    public void setLargura(int largura) {
        this.largura = largura;
    }

    @Override
    public int getArea() {
        return comprimento * largura;
    }

    @Override
    public int getPerimetro() {
        int perimetro = comprimento + comprimento + largura + largura;
        return perimetro;
    }

    @Override
    public String getNomeFiguraPlana() {
        return "Rectangulo";
    }
}
