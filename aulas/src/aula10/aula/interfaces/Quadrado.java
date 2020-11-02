package aula10.aula.interfaces;

public class Quadrado implements FiguraGeometricaPlana{
    private int lado;

    public Quadrado(int lado){
        this.lado = lado;
    }

    public int getLado(){
        return lado;
    }
    public void setLado(){
        this.lado=lado;
    }

    @Override
    public int getArea(){
        return lado * lado;
    }

    @Override
    public int getPerimetro(){
        int perimetro = lado * 4;
        return perimetro;
    }
    @Override
    public String getNomeFiguraPlana(){
        return "Quadrado";
    }
}