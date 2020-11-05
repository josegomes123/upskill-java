package aula13.exercicio1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {
        // Crio arraylist de pessoas
        ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
        try {
            // Obtem a directoria do project para aceder ao ficheiro
            String localDir = System.getProperty("user.dir");
            // Obtem a localizaçao correcta do ficheiro juntando o caminho localDir + o caminho relativo do projecto em que se está a trabalhar
            // Este caminho é totalmente variável e depende da organizaçao do projecto de cada um e tambem se usam Mac, Windows ou Linux
            File f = new File(localDir + "\\aulas\\src\\aula13\\exercicio1\\pessoas.txt");
            // Abre o ficheiro com o Scanner
            Scanner fileScanner = new Scanner(f);
            // Enqaunto houver linhas pra fazer scan, continua
            while (fileScanner.hasNextLine()) {
                String linha = fileScanner.nextLine();
                // Divide a linha numa array de String pelo separador ":" usando o split()
                String[] partesPessoa = linha.split(":");
                // Criar nova pessoa e adiciona automaticamente à listaPessoas
                listaPessoas.add(new Pessoa(partesPessoa[0], Integer.parseInt(partesPessoa[1]), partesPessoa[2]));
            } // Fecha o fileScanner
            fileScanner.close();
        } catch (FileNotFoundException e) {
            // Apanha e trata o erro
            System.out.println("Ficheiro não encontrado");
            e.printStackTrace();
        } // Imprime a lista de pessoas obtida do ficheiro
        System.out.println(listaPessoas);
    }
}
