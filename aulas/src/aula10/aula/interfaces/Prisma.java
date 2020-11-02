package aula10.aula.interfaces;

public class Prisma implements FiguraGeometricaTridimensional  {
   private int altura;
   Quadrado quadrado;
   Circulo circulo;
   Rectangulo rectangulo;

   public Prisma(Quadrado quadrado, int altura){
       this.quadrado = quadrado;
       this.altura = altura;
   }

    public Prisma(Rectangulo rectangulo, int altura){
        this.rectangulo = rectangulo;
        this.altura = altura;
    }

    public Prisma(Circulo circulo, int altura){
        this.circulo = circulo;
        this.altura = altura;
    }

    @Override
    public String getNomeFiguraTridimensinal() {
        if (!(quadrado == null)){
            return "Prisma " + quadrado.getNomeFiguraPlana();
        } else if (!(rectangulo == null)){
            return "Prisma " + rectangulo.getNomeFiguraPlana();
        } else if (!(circulo == null)) {
            return "Prisma " + circulo.getNomeFiguraPlana();
        }
        return "Prisma";
    }

    @Override
    public int getAltura() {
        return this.altura;
    }

    @Override
    public int getVolume() {
        if (!(quadrado == null)){
            return quadrado.getArea() *  altura;
        } else if (!(rectangulo == null)){
            return rectangulo.getArea() * altura;
        } else if (!(circulo == null)) {
            return circulo.getArea() * altura;
        }
        return 0;
    }
}
