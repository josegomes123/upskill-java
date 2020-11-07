package aula13.exercicio5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Testes {

    public static void main(String[] args) {
        // Obtem a directoria do project para aceder ao ficheiro
        String localDir = System.getProperty("user.dir");
        // Obtem a localizaçao correcta do ficheiro juntando o caminho localDir + o caminho relativo do projecto em que se está a trabalhar
        // Este caminho é totalmente variável e depende da organizaçao do projecto de cada um e tambem se usam Mac, Windows ou Linux
        File f = new File(localDir + "\\aulas\\src\\aula13\\exercicio5\\" + "mapaOriginal.txt");
        try {
            // Abre o ficheiro com o Scanner
            Scanner fileScanner = new Scanner(f);
            // Enqaunto houver linhas pra fazer scan, continua
            while (fileScanner.hasNextLine()) {
                String linha = fileScanner.nextLine();
                // Faz replace dos caracteres pedidos
                String linhaFinal = linha.replace('#','W');
                linhaFinal = linhaFinal.replace('b',' ');
                linhaFinal = linhaFinal.replace('X',' ');
                linhaFinal = linhaFinal.replace('C',' ');
                linhaFinal = linhaFinal.replace('O',' ');
                linhaFinal = linhaFinal.replace('E',' ');
                System.out.println(linhaFinal);
            } // Fecha o fileScanner
            fileScanner.close();
        } catch (FileNotFoundException e) {
            // Apanha e trata o erro
            System.out.println("Ficheiro não encontrado");
            e.printStackTrace();
        }
    }
}
