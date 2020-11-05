package aula13.aula;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {
        // Crio arraylist de pessoas
        ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
        try {
            Scanner fileScanner = new Scanner(new File("C:\\Users\\user\\IdeaProjects\\upskill.JoseGomes\\src\\aula13\\aula\\pessoas.txt"));
            while (fileScanner.hasNextLine()) {
                String linha = fileScanner.nextLine();
                String[] partesPessoa = linha.split(":");
                listaPessoas.add(new Pessoa(partesPessoa[0], Integer.parseInt(partesPessoa[1]), partesPessoa[2]));
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Erro de ficheiro");
        }
        System.out.println(listaPessoas);
    }
}
