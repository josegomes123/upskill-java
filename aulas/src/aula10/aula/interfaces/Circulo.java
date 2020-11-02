package aula10.aula.interfaces;

public class Circulo implements FiguraGeometricaPlana {
    private int raio;

    public Circulo(int raio){
        this.raio = raio;
    }


    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    @Override
    public int getArea() {
        return (int) Math.pow(Math.PI*raio, 2);
    }

    @Override
    public int getPerimetro() {
        int perimetro = (int) (2* Math.PI * raio);
        return perimetro;
    }

    @Override
    public String getNomeFiguraPlana() {
        return "Circulo";
    }
}
