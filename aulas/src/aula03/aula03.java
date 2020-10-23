package aula03;
import java.util.Scanner;

public class aula03 {

    public static void main(String[] args) {
        //int result = arredondar2(2.3r);
        getTemperature(82);
        verNumero();
    }

    static int arredondar2(double a){
        if (a% (int)a >= 0.5){
            return (int) a+1;
        } else {
            return (int) a;
        }
    }

    static void getTemperature(int temp){
        if (temp<0){
            System.out.println("está gelado");
        } else if (temp<15){
            System.out.println("está frio");
        } else if (80>temp && temp>50){
            System.out.println("está quente");
        } else if (temp>80){
            System.out.println("está a ferver");
        } else {
            System.out.println("está normal");
        }
    }

    static void verNumero(){
        Scanner keyboard = new Scanner(System.in);
        int numero = keyboard.nextInt();
        if (numero<0) {
            System.out.println("este numero é negativo");
        } else if (numero>0) {
            System.out.println("este numero é positivo");
        } else {
            System.out.println("este numero é 0");
        }
    }
}
