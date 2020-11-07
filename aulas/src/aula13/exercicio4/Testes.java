package aula13.exercicio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Testes {
    ArrayList<Lampada> listaLampadas = new ArrayList<Lampada>();
    // Adiciona lampadas à lista
    public void addLampada(Lampada l){
        listaLampadas.add(l);
    }

    // Cria lampadas pela informaçao do utilizador
    public void criarLampadas(){
        // Pede informaçao ao utilizador
        Scanner s = new Scanner(System.in);
        System.out.println("Quantas lampadas quer criar?");
        int numLampadas = 0;
        // Recebe o num de lampadas a criar
        try {
            numLampadas = s.nextInt();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro! Por favor insira o valor inteiro do numero de lampadas");

        }
        // Cria um certo num de lampadas e adiciona à lista
        for (int i = 1; i<=numLampadas; i++){
            System.out.println("Introduza a potencia em Watts da lampada num " + i + ": ");
            try {
                int wattsLampada = s.nextInt();
                Lampada l = new Lampada(wattsLampada);
                addLampada(l);
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Erro! Por favor insira o valor inteiro em Watts");
            }
        }
    }


    // Obtem informaçao do utilizador e cria o ficheiro
    public void criaFicheiro(String nomeFicheiro) {
        // Obtem a directoria do project para aceder ao ficheiro
        String localDir = System.getProperty("user.dir");
        // Obtem a localizaçao correcta do ficheiro juntando o caminho localDir + o caminho relativo do projecto em que se está a trabalhar
        // Este caminho é totalmente variável e depende da organizaçao do projecto de cada um e tambem se usam Mac, Windows ou Linux
        File f = new File(localDir + "\\aulas\\src\\aula13\\exercicio4\\" + nomeFicheiro);
        try { // Trata o erro
            PrintWriter fileWriter = new PrintWriter(f);
            for (Lampada l: this.listaLampadas) {
                // Escreve o nome e idade no ficheiro
                fileWriter.println(l);
            }
            fileWriter.close();
        } catch (FileNotFoundException e) {
            // Apanha e trata o erro
            System.out.println("Ficheiro não encontrado");
            e.printStackTrace();
        }
    }

    // Imprime a lista de lampadas
    public void mostraLampadas(){
        System.out.println("Lista de lampadas guardada:");
        for (Lampada l: listaLampadas) {
            System.out.println(l);
        }
    }


    public static void main(String[] args) {
        Testes t = new Testes();
        t.criarLampadas();
        t.criaFicheiro("lampadas.txt");
        t.mostraLampadas();
    }
}