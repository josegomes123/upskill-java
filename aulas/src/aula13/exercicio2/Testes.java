package aula13.exercicio2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Testes {

    // Funçao muito semelhante ao criado no Exercicio 1
    // Le o ficheiro e escreve na consola o resultado lido
    public static void lerFicheiro(File ficheiro) {
        try {
            // Abre o ficheiro com o Scanner
            Scanner fileScanner = new Scanner(ficheiro);
            // Enqaunto houver linhas pra fazer scan, continua
            while (fileScanner.hasNextLine()) {
                String linha = fileScanner.nextLine();
                // Divide a linha numa array de String pelo separador que escolhi "," usando o split()
                String[] userInput = linha.split(",");
                // Imprime o resultado na consola
                System.out.println("Nome: " + userInput[0] + " Idade: " + userInput[1]);
            } // Fecha o fileScanner
            fileScanner.close();
        } catch (FileNotFoundException e) {
            // Apanha e trata o erro
            System.out.println("Ficheiro não encontrado");
            e.printStackTrace();
        }
    }

    // Obtem informaçao do utilizador e cria o ficheiro
    public static File criaFicheiro(String nomeFicheiro) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduza o seu nome:");
        String nome = s.nextLine();
        System.out.println("Introduza a sua idade:");
        // Aqui nao é relevante receber int porque ao ler o ficheiro e imprimirmos na consola
        // vamos estar a imprimir a idade em formato String de qualquer maneira
        String idade = s.nextLine();
        // Obtem a directoria do project para aceder ao ficheiro
        String localDir = System.getProperty("user.dir");
        // Obtem a localizaçao correcta do ficheiro juntando o caminho localDir + o caminho relativo do projecto em que se está a trabalhar
        // Este caminho é totalmente variável e depende da organizaçao do projecto de cada um e tambem se usam Mac, Windows ou Linux
        File f = new File(localDir + "\\aulas\\src\\aula13\\exercicio2\\" + nomeFicheiro);
        try { // Trata o erro
            PrintWriter fileWriter = new PrintWriter(f);
            // Escreve o nome e idade no ficheiro
            fileWriter.println(nome + "," + idade);
            fileWriter.close();
        } catch (FileNotFoundException e) {
            // Apanha e trata o erro
            System.out.println("Ficheiro não encontrado");
            e.printStackTrace();
        }
        return f;
    }


    public static void main(String[] args) {
        File ficheiroCriado = criaFicheiro("teste.txt");
        lerFicheiro(ficheiroCriado);
    }
}
