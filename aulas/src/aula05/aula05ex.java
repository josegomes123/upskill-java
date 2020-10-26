package aula05;

import java.util.Arrays;

public class aula05ex {
    public static void main(String[] args) {
        // Primeira Pagina - Testes
        //ex 1 - Testes
        System.out.println("1. Vector de Naturais");
        // Converto a array com o metodo toString() para a converter a uma string que
        // possa ser impressa com o System.out
        System.out.println(Arrays.toString(naturals(5)));
        //ex 2 - Testes
        System.out.println("2. Vector de Naturais Random");
        System.out.println(Arrays.toString(randomDigits(5)));
        //ex 3 - Testes
        System.out.println("3. Vector de 50 Nums a partir de 101");
        System.out.println(Arrays.toString(array50()));
        //ex 4 - Testes
        System.out.println("4. Copia de vector");
        int[] array1 = {1,2,3};
        System.out.println(Arrays.toString(copy(array1,6)));
        //ex 5 - Testes
        System.out.println("5. Numero existe dentro do vector");
        int[] array2 = {1,3,4,5};
        int[] array3 = {2,3};
        System.out.println(exists(5, array2));
        System.out.println(exists(1,array3));
        //ex 6 - Testes
        char[] array4 = new char[] {"a","b","c","a"};
        System.out.println("6. Conta numero de Ocorrências");
        System.out.println(count("a", array4));

        // Segunda Pagina
        //ex 5 - Testes
        System.out.println("5. Inverte Vector");
        System.out.println(Arrays.toString(invert(array1)));
    }

    //PAGINA 1  EX 1-7

    // 1. Construir um vetor de números naturais até um dado número n. Exemplo: naturals(5)->{1,2,3,4,5}
    public static int[] naturals(int n){
        int[] intArray = new int[n];
        for (int i=0; i<n; i++){
            intArray[i] = i+1;
        }
        return intArray;
    }

    // 2. Construir um vetor de dígitos aleatórios (números de 0 a 9), dado o comprimento. Exemplo:
    // randomDigits(5)->{8,2,9,1,2}
    public static int[] randomDigits(int n){
        int[] intArray = new int[n];
        for (int i=0; i<n; i++){
            // Numero random entre 0 e 9
            intArray[i] = (int) (Math.random()*10);
        }
        return intArray;
    }


    // 3. Construir um vetor capaz de armazenar 50 números inteiros. Em seguida faça o seu
    //preenchimento automático com os números 101 a 150, ou seja na posição número 0 fica 101, na
    //posição número 1 fica 102 e por aí adiante.
    public static int[] array50(){
        int[] intArray = new int[50];
        int startNum = 101;
        for (int i=0; i<50; i++){
            // Introduz o numero inicial (101) na posiçao do vector e incrementa o num para o proximo ciclo
            intArray[i] = startNum++;
        }
        return intArray;
    }

    // 4. Copiar (replicar) um vetor de inteiros, tendo o novo vetor o mesmo tamanho do argumento.
    // Exemplo: copy({1,2,3},6)->{1,2,3,0,0,0} copy({1,2,3,4,5,6},3)->{1,2,3}
    public static int[] copy(int[] vector, int dimensao){
        // criar nova array para guardar a copia alterada
        int[] newArray = new int[dimensao];
        // Calcular a dimensao minima das 2 arrays para evitar erros
        // "Index out of bounds" e só copiar até ao sitio certo
        int minLength = Math.min(dimensao, vector.length);
        // iterar na antiga array e copiar elemento a elemento para a nova
        for (int i=0; i<minLength; i++){
           newArray[i] = vector[i];
        }
        return newArray;
    }

    // 5. Verificar se existe um determinado número num vetor. Exemplo: exists(5,{1,3,4,5})->true
    // exists(1,{2,3})->false
    public static boolean exists(int num, int[] vector){
        // percorrer o vector e verificar posição a posição es existe o numero dado
        for (int i = 0; i<vector.length; i++){
            if (vector[i] == num){
                return true;
            }
        }
        // caso o num nao tenha sido encontrado em nenhuma posiçao, não existe
        return false;
    }

    // 6. Contar o número de ocorrências de um determinado caracter. Exemplo: count(a,{a,b,c,a})->2
    public static int count(char car, char[] vector){
        // cria contador pra guardar o numero de ocorrencias
        int contador = 0;
        // percorrer o vector e verificar posição a posição es existe o caracter dado
        // se existir, incrementa o contador e no final retorna esse contador
        for (int i = 0; i<vector.length; i++){
            if (vector[i] == car){
                contador++;
            }
        }
        return contador;
    }


    // PAGINA 2 EX 1-7

    // 5. Construir um vetor invertido com base noutro. Ou seja, o novo vetor será composto pelos
    //elementos do vetor dado pela ordem inversa. Exemplo: invert({t,q,a)}->{a,q,t}
    public static int[] invert(int[] vector){
        int[] inversedArray =  new int[vector.length];
        int u = 1;
        for (int i=0; i<vector.length; i++){
            inversedArray[i] = vector[vector.length-u];
            u++;
        }
        return inversedArray;
    }


}
