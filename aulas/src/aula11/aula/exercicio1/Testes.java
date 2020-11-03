package aula11.aula.exercicio1;

import java.util.ArrayList;

public class Testes {

    public static void main(String[] args) {
        // Crio arraylist, crio contactos e adiciono à lista
        ArrayList<Contacto> listaContactos = new ArrayList<Contacto>();
        Contacto c1 = new Contacto("João Silva", 91000000, "joao.silva@gmail.com");
        Contacto c2 = new Contacto("Pedro Fernantes", 91000001, "pedro.fernandes@gmail.com");
        Contacto c3 = new Contacto( "Maria Rita", 91000002, "maria.ritinha@gmail.com");
        Contacto c4 = new Contacto( "Rita", 91045002, "ritinha@gmail.com");
        listaContactos.add(c1);
        listaContactos.add(c2);
        listaContactos.add(c3);
        listaContactos.add(c4);
        System.out.println(listaContactos);
        listaContactos.remove(c3);
        System.out.println("Depois de remover o c3");
        System.out.println(listaContactos);
        System.out.println("Obter c5");
        System.out.println(listaContactos.get(2));
    }
}
