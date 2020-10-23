package aula04;

public class aula04 {
    public static void main(String[] args) {
        System.out.println("Num Par While");
        numparWhile();
        System.out.println("Num Par Do While");
        numparDoWhile();
        System.out.println("Num Par For ");
        numparFor();
        System.out.println("Num MAX num vector ");
        int[] v = new int[3];
        v[0]=1;
        v[1]=5;
        v[2]=8;
        int MaxArray = maxVector(v);
        System.out.println(MaxArray);
    }


    //Imprime na consola todos os Numeros Pares de 1 a 20 Com ciclo While
    public static void numparWhile(){
        int n = 1;
        while (n<=20){
            // Verifica se n é par
            if (n%2==0){
                System.out.println(n);
            }
            n++;
        }
    }

    //Imprime na consola todos os Numeros Pares de 1 a 20 Com ciclo Do While
    public static void numparDoWhile(){
        int n = 1;
        do {
            // Verifica se n é par
            if (n%2==0){
                System.out.println(n);
            }
            n++;
        }  while (n<=20);
    }

    //Imprime na consola todos os Numeros Pares de 1 a 20 Com ciclo For
    public static void numparFor(){
        for (int n =1; n<=20; n++){
            // Verifica se n é par
            if (n%2==0){
                System.out.println(n);
            }
        }
    }

    //Saber se inteiro existe num vector
    public static boolean exists(int a, int[] v){
        for (int i=0; i<v.length; i++){
            if (v[i]==a){
                return true;
            }
        }
        return false;
    }


    //Devolver max
    public static int maxVector(int[] v){
        int max=0;
        for (int i=0; i<v.length; i++){
            if (v[i]>max){
                max=v[i];
            }
        }
        return max;
    }

}
