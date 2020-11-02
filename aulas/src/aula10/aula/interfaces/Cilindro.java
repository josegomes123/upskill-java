package aula10.aula.interfaces;

public class Cilindro extends Circulo implements FiguraGeometricaTridimensional{
    private int altura;

    public Cilindro(int raio, int altura){
        super(raio);
        this.altura = altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String getNomeFiguraTridimensinal() {
        return "Cilindro";
    }

    @Override
    public int getAltura() {
        return altura;
    }


    @Override
    public int getVolume() {
        return getArea() * altura;
    }

}
