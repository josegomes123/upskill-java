package aula10.aula.interfaces;

public class Testes {

    public static void main(String[] args) {
        // Teste Circulo
        Circulo circ = new Circulo(2);
        System.out.println(circ.getNomeFiguraPlana());
        System.out.println("Area: " +circ.getArea());
        System.out.println("Perimetro: " + circ.getPerimetro());
        // Teste Cilindro
        Cilindro cil = new Cilindro(4, 3);
        System.out.println(cil.getNomeFiguraTridimensinal());
        System.out.println("Volume: " + cil.getVolume());

        // Teste Prisma
        Quadrado quad = new Quadrado(2);
        Rectangulo rect = new Rectangulo(2,3);
        Prisma prismquad = new Prisma(quad, 5);
        Prisma prismrect = new Prisma(rect, 3);
        System.out.println(quad.getNomeFiguraPlana());
        System.out.println("Area: " + quad.getArea());
        System.out.println(rect.getNomeFiguraPlana());
        System.out.println("Area: " + rect.getArea());
        System.out.println(prismquad.getNomeFiguraTridimensinal());
        System.out.println("Volume: " + prismquad.getVolume());
        System.out.println(prismrect.getNomeFiguraTridimensinal());
        System.out.println("Volume: " + prismrect.getVolume());
    }
}
