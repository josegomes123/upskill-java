package aula24.exercicio1;

import java.io.*;
import java.util.Scanner;

public class Testes {

    public static void serialize(User object) {
        try {
            String localDir = System.getProperty("user.dir");
            FileOutputStream fileOut = new FileOutputStream(localDir + "\\aulas\\src\\aula25\\exercicio1\\save.dat");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(object);
            out.close();
            fileOut.close();
        } catch (IOException e) {
            System.out.println("Erro a salvar o mapa no ficheiro!");
        }
    }

    public static User deserialize() {
        User loadedUser = null;
        try {
            String localDir = System.getProperty("user.dir");
            FileInputStream fileIn = new FileInputStream(localDir+"\\aulas\\src\\aula25\\exercicio1\\save.dat");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            loadedUser = (User) in.readObject();
            in.close();
            fileIn.close();
            // Imprime valor convertido
            System.out.println(loadedUser.toString());
            return loadedUser;
        } catch (IOException e) {
            System.out.println("Erro a ler o ficheiro com o save do mapa!");
        } catch (ClassNotFoundException e) {
            System.out.println("Não foi possível converter o objeto salvo no mapa!");
        } finally {
            return loadedUser;
        }
    }

    public static void main(String[] args) {
        System.out.println(" Introduza “1” para Salvar Dados e “2” para Carregar Dados.");
        Scanner s = new Scanner(System.in);
        String comando = s.nextLine();
        if (comando.equals("2")) {
            User userObtido = deserialize();
            System.out.println(userObtido);
        } else if (comando.equals("1")) {
            s.close();
            Scanner s1 = new Scanner(System.in);
            String nome ="";
            String texto="";
            String titulo="";
            System.out.println("Introduza nome de user:");
            if (s1.hasNextLine()) {
                nome = s1.nextLine();
            }
            System.out.println("Introduza texto de user:");
            if (s1.hasNextLine()) {
                texto = s1.nextLine();
            }
            System.out.println("Introduza titulo de user:");
            if (s1.hasNextLine()) {
                titulo = s1.nextLine();
            }
            User user = new User(nome, texto, titulo);
            serialize(user);

        }

    }

}
