package aula13.exercicio3;

/* Implemente uma classe ContaBancaria que contém um método para adicionar a uma Lista de movimentos com a assinatura
(String descrição, double valor) e outro para guardar as informações relativas aos movimentos feitos na conta.
Os movimentos devem ser guardados num ficheiro .txt
com a seguinte formatação (id, descrição, valor):1;almoço;122;lanche;5
Por fim, criar um construtor que receba apenas o nome do ficheiro e construa o objecto
 ContaBancaria com base nos valores do ficheiro.
*/


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContaBancaria {
    // Create an empty hash map
    HashMap<Integer, Movimento> listaMovimentos = new HashMap<>();
    // inicializa os movimentos a 1
    int idMovimentos;

    // Contrutor vazio para inicializar
    ContaBancaria (){
        idMovimentos = 1;
    }

    //Construtor da classe a partir do ficheiro
    ContaBancaria(String nomeFicheiro){
        try {
            // Obtem a directoria do project para aceder ao ficheiro
            String localDir = System.getProperty("user.dir");
            // Obtem a localizaçao correcta do ficheiro juntando o caminho localDir + o caminho relativo do projecto em que se está a trabalhar
            // Este caminho é totalmente variável e depende da organizaçao do projecto de cada um e tambem se usam Mac, Windows ou Linux
            File f = new File(localDir + "\\aulas\\src\\aula13\\exercicio3\\" + nomeFicheiro);
            // Abre o ficheiro com o Scanner
            Scanner fileScanner = new Scanner(f);
            // Enqaunto houver linhas pra fazer scan, continua
            while (fileScanner.hasNextLine()) {
                String linha = fileScanner.nextLine();
                // Divide a linha numa array de String pelo separador que escolhi ";" usando o split()
                String[] userInput = linha.split(";");
                // Converte a informaçao que leu
                int idMov = Integer.parseInt(userInput[0]);
                String descricaoMov = userInput[1];
                // Tem de converter o double de String usando Double.parseDouble()
                double valorMov = Double.parseDouble(userInput[2]);
                // Cria o movimento pela informaçao que leu da linha
                Movimento mov = new Movimento(descricaoMov, valorMov);
                // Actualiza o hashmap
                listaMovimentos.put(idMov, mov);
            } // Fecha o fileScanner
            fileScanner.close();
        } catch (FileNotFoundException e) {
            // Apanha e trata o erro
            e.printStackTrace();
        }
    }

    public void adicionarMovimento(String descricao, double valor){
        // Cria movimento num objecto
        Movimento mov = new Movimento(descricao, valor);
        // Adiciona ao hash
        listaMovimentos.put(idMovimentos, mov);
        // Incrementa o ID dos movimentos
        idMovimentos++;
    }

    // Cria ficheiro a partir do hashmap de movimentos e devolve o ficheiro
    public File criaFicheiro(String nomeFicheiro) {
        // Obtem a directoria do project para aceder ao ficheiro
        String localDir = System.getProperty("user.dir");
        // Obtem a localizaçao correcta do ficheiro juntando o caminho localDir + o caminho relativo do projecto em que se está a trabalhar
        // Este caminho é totalmente variável e depende da organizaçao do projecto de cada um e tambem se usam Mac, Windows ou Linux
        File f = new File(localDir + "\\aulas\\src\\aula13\\exercicio3\\" + nomeFicheiro);
        try {
            PrintWriter fileWriter = new PrintWriter(f);
            // Trata o erro
            // Escreve o nome e idade no ficheiro
            // Iterar um hashmap - Consultar o link abaixo
            //  https://stackoverflow.com/questions/1066589/iterate-through-a-hashmap
            for (Integer key : listaMovimentos.keySet()) {
                Movimento mov = listaMovimentos.get(key);
                fileWriter.println(key + ";" + mov.getDescricao() + ";" + mov.getValor());
            }
            fileWriter.close();
        } catch (FileNotFoundException e) {
            // Apanha e trata o erro
            e.printStackTrace();
        }
        return f;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "listaMovimentos=" + listaMovimentos +
                '}';
    }
}
