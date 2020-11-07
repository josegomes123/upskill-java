package aula13.exercicio6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Testes {
    ArrayList<Reparacao> listaReparacoes = new ArrayList<Reparacao>();
    // Funçao muito semelhante ao criado no Exercicio 1


    // Le o ficheiro e escreve na consola o resultado lido
    public void lerFicheiro(String nomeFicheiro) {
        try {
            // Obtem a directoria do project para aceder ao ficheiro
            String localDir = System.getProperty("user.dir");
            // Obtem a localizaçao correcta do ficheiro juntando o caminho localDir + o caminho relativo do projecto em que se está a trabalhar
            // Este caminho é totalmente variável e depende da organizaçao do projecto de cada um e tambem se usam Mac, Windows ou Linux
            File f = new File(localDir + "\\aulas\\src\\aula13\\exercicio6\\" + nomeFicheiro);
            // Abre o ficheiro com o Scanner
            Scanner fileScanner = new Scanner(f);
            // Enqaunto houver linhas pra fazer scan, continua
            while (fileScanner.hasNextLine()) {
                String linha = fileScanner.nextLine();
                // Divide a linha numa array de String pelo separador que escolhi ";" usando o split()
                String[] userInput = linha.split(";");
                String matricula = userInput[0];
                String nome = userInput[1];
                String item = userInput[2];
                Double valor = Double.parseDouble(userInput[3]);
                Reparacao r = new Reparacao(matricula, nome, item, valor);
                listaReparacoes.add(r);
            } // Fecha o fileScanner
            fileScanner.close();
        } catch (FileNotFoundException e) {
            // Apanha e trata o erro
            System.out.println("Ficheiro não encontrado");
            e.printStackTrace();
        }
    }

    public void imprimeLista() {
        // Imprime a lista de reparacoes
        System.out.println("Lista de Reparaçoes final:");
        for (Reparacao l : listaReparacoes) {
            System.out.println(l);
        }
    }


    // Cria ficheiro a partir do hashmap de movimentos e devolve o ficheiro
    public File criaFicheiro(String nomeFicheiro) {
        // Obtem a directoria do project para aceder ao ficheiro
        String localDir = System.getProperty("user.dir");
        // Obtem a localizaçao correcta do ficheiro juntando o caminho localDir + o caminho relativo do projecto em que se está a trabalhar
        // Este caminho é totalmente variável e depende da organizaçao do projecto de cada um e tambem se usam Mac, Windows ou Linux
        File f = new File(localDir + "\\aulas\\src\\aula13\\exercicio6\\" + nomeFicheiro);
        try { // Trata o erro
            PrintWriter fileWriter = new PrintWriter(f);
            for (Reparacao r : this.listaReparacoes) {
                // Escreve o nome e idade no ficheiro
                fileWriter.println(r);
            }
            fileWriter.close();
        } catch (FileNotFoundException e) {
            // Apanha e trata o erro
            System.out.println("Ficheiro não encontrado");
            e.printStackTrace();
        }
        return f;
    }


    public static void main(String[] args) {
        // Cria obj testes para testar as funcoes
        Testes t = new Testes();
        // Abre varios ficheiros
        t.lerFicheiro("rep1.txt");
        t.lerFicheiro("rep2.txt");
        t.lerFicheiro("rep3.txt");
        // Imprime o total das reparaçoes abertas nos ficheiros
        t.imprimeLista();
        // Guarda novo ficheiro com o total de reparacoes
        t.criaFicheiro("totalRep.txt");
    }
}
