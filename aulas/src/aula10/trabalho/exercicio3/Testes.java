package aula10.trabalho.exercicio3;

import java.util.Arrays;

public class Testes {
    //Testes ex3 trabalho aula10
    public static void main(String[] args) {
        // Crio arraylist, crio contactos e adiciono à lista
        Contacto c1 = new Contacto("João Silva", 93000000);
        Contacto c2 = new Contacto("Pedro Fernantes", 91000001);
        Contacto c3 = new Contacto("Rita", 95000002);
        Contacto c4 = new Contacto("André", 92000001);
        Contacto c5 = new Contacto("Ricardo", 930001);
        Contacto c6 = new Contacto("Rita", 91045002);
        Contacto[] listaContactos = {c1, c2, c3, c4, c5, c6};
        // Lista contacto sem ordenaçao
        System.out.println("Lista de contactos antes de ser ordenada");
        for (Contacto c : listaContactos) {
            System.out.println(c.toString());
        }
        //Ordena a lista e imprime (ordena segundo o nome e depois segundo o num)
        System.out.println("Lista de contactos depois de ser ordenada");
        Arrays.sort(listaContactos);
        for (Contacto c : listaContactos) {
            System.out.println(c.toString());
        }
    }
}
