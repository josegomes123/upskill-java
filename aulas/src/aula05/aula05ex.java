package aula05;

import java.util.Arrays;

public class aula05ex {
    // Exercicios de trabalho autonomo da aula05
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
        char[] array4 = {'a', 'b', 'c', 'a'};
        System.out.println("6. Conta numero de Ocorrências");
        System.out.println(count('a', array4));
        //ex 7 - Testes
        int[] array5 = {3,6,1,2,4,1,8};
        System.out.println("7. Sub Array");
        System.out.println(Arrays.toString(subArray(2, 6,  array5)));
        // Segunda Pagina
        //ex 1 - Testes
        int[] array6 = {1,2,3,4,5};
        System.out.println("Segunda Pagina - 1. FirstHalf");
        System.out.println(Arrays.toString(firstHalf(array6, true)));
        //ex 2 - Testes
        int[] vector1 = {1,2,3};
        int[] vector2 = {9,10, 11};
        System.out.println("Segunda Pagina - 2. Merge");
        System.out.println(Arrays.toString(juntarVector(vector1, vector2)));
        //ex 3 - Testes (usa array ja definida acima)
        System.out.println("Segunda Pagina - 3. Inverte Vector");
        System.out.println(Arrays.toString(invert(vector1)));
        //ex 4 - Testes (usa array ja definida acima)
        System.out.println("Segunda Pagina - 4. Duplica Elementos");
        System.out.println(Arrays.toString(duplicateEveryElement(vector1)));
        //ex 5 - Testes
        int[] vector3 = {3,2,1};
        System.out.println("Segunda Pagina - 5. Duplica e Inverte");
        System.out.println(Arrays.toString(duplicateInverted(vector3)));
        //ex 6 - Testes
        int[] vector4 = {1,2,3,4,5};
        System.out.println("Segunda Pagina - 6. Copiar sem elemento do meio");
        System.out.println(Arrays.toString(copyWithoutMiddleElement(vector4)));
        //ex 7 - Testes
        System.out.println("Segunda Pagina - 7. Fibonacci");
        System.out.println(Arrays.toString(fibonnacci(7)));
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
    // Usei um array the Int[] para todos estes para facilitar os testes e poder chamar umas funçoes dentro de outras
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
    // Usei um array the Int[] para todos estes para facilitar os testes e poder chamar umas funçoes dentro de outras
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

    // 7. Construir um sub-vetor de outro vetor, dados os índices do primeiro elemento e último a incluir.
    //Exemplo subarry(2,4,{a,d,r,a,c,r,w})}->{r,a,c}
    // Usei um array the Int[] para todos estes para facilitar os testes e poder chamar umas funçoes dentro de outras
    public static int[] subArray(int startIndex, int endIndex, int[] originalArray){
        // Uso a função copyOfRange() da Library Arrays que faz exactamente o que é pedido
        // adicionei o +1 ao endIndex para incluir o ultimo index, uma vez que a função original exclui este
        int[] newArray = Arrays.copyOfRange(originalArray, startIndex, endIndex+1);
        return newArray;
    }


    // PAGINA 2 EX 1-7

    // 1. Obter a primeira metade um vetor v, incluindo um parâmetro booleano para permitir se o elemento
    //do meio é para incluir (caso o comprimento do vetor seja ímpar). Se o comprimento for par, este
    //parâmetro não terá efeito. Exemplo firstHalf({b,a,s,w,q}, true)->{b,a,s}
    public static int[] firstHalf( int[] vector, boolean param){
        // Verificar se o vector tem n de elementos par, e guardar na variavel vectorPar
        boolean vectorPar = vector.length % 2 == 0;
        // Guarda o indice do elemento do meio
        int elemementoMeio = (int) vector.length/2;
        if (vectorPar) {
            // Uso a funçao criada anteriormente (subArray) para nos cortar a Array dada ao meio.
            return subArray(0, elemementoMeio, vector);
            // se nao for par mas o boolean for true, entao inclui o elemento do meio na array
        } else if (param == true) {
            return subArray(0, elemementoMeio, vector);
        } else {
            return subArray(0, elemementoMeio-1, vector);
        }
    }

    // 2. Construir um vetor juntando outros dois vetores (parte esquerda e parte direita). Exemplo:
    //merge({1,2},{9,10})
    public static int[] juntarVector( int[] vector1, int[] vector2){
        // Somo os comprimentos de cada vector para dar o comprimento total do vector final
        int totalLength = vector1.length + vector2.length;
        // crio o vector final com totalLength comprimento
        int[] resultArray = new int[totalLength];
        // Itero a primeira array e copio na totalidade para o vector final
        for (int i = 0; i<vector1.length; i++){
            resultArray[i] = vector1[i];
        }
        // Itero a segunda array e copio na totalidade para o vector final
        // Ter atenção que só começo a copiar no index de final de copia anterior (vector1.length)
        for (int i = 0; i<vector2.length; i++){
            resultArray[vector1.length+i] = vector2[i];
        }
        return resultArray;
    }

    // 3. Construir um vetor invertido com base noutro. Ou seja, o novo vetor será composto pelos
    //elementos do vetor dado pela ordem inversa. Exemplo: invert({t,q,a)}->{a,q,t}
    public static int[] invert(int[] vector){
        //crio vector final
        int[] inversedArray =  new int[vector.length];
        // uso "u" para percorrer o vector final de forma decrescente
        int u = 1;
        // itero o vector e vou copiando cada index para um outro vector mas em ordem decrescente usando o u
        for (int i=0; i<vector.length; i++){
            inversedArray[i] = vector[vector.length-u];
            u++;
        }
        return inversedArray;
    }

    // 4. Construir um vetor com base noutro, de modo o dobro do tamanha e cada elemento duplicado.
    //Exemplo: duplicateEveryElement({a,s,d})->{a,a,s,s,d,d}
    public static int[] duplicateEveryElement(int[] vector){
        //Duplico o comprimento actual para dar o comprimento final
        int totalLength = vector.length*2;
        //Crio array com o novo comprimento
        int[] resultArray = new int[totalLength];
        // Crio um novo contador para ajudar a percorrer a array final
        int contador = 0;
        // Percorro a Array vector com o i, e percorro a Array final com contador
        // assim o contador ajuda a saltar a array final de 2 em 2 indices
        for (int i=0; i<vector.length; i++) {
            resultArray[contador] = vector[i];
            resultArray[contador+1] = vector[i];
            // Incremento o contador em 2, visto que é para duplicar todos os elementos
            // só interessa contar os indices de 2 em 2
            contador+=2;
        }
        return resultArray;
    }

    // 5. Construir um vetor com base noutro, sendo a primeira metade uma cópia e a segunda metade os
    //mesmos elementos para ordem inversa. Exemplo: duplicateInverted({3,2,1})->(3,2,1,1,2,3)
    public static int[] duplicateInverted(int[] vector){
        // Usando as funcoes já criadas anteriormente juntarVector() e invert()
        // consido juntar o vector original com o inverso do proprio
        return juntarVector(vector, invert(vector));
    }

    // 6. Construir um vetor com base noutro, representado um cópia sem o elemento do meio (caso o
    //tamanho seja ímpar) Exemplo: copyWithoutMiddleElement({1,2,3,4,5})->{1,2,4,5}
    public static int[] copyWithoutMiddleElement(int[] vector){
        // Usando a funcao firstHalf() anterior consigo a primeira metade sem o elemento do meio
        int[] inicio = firstHalf(vector, false);
        // Obtenho o index do meio
        int indexMeio = (int) vector.length/2 + 1;
        // Usando a funcao subArray() anterior obtenho a segunda metade da array
        int[] fim = subArray(indexMeio, vector.length-1, vector);
        // No final retorno a 2 metades juntas usando o juntarVector()
        return juntarVector(inicio, fim);
    }

    // 7. Construir um vetor com n números da sequência Fibonacci.
    // Exemplo: fibonacciSequence(7)-> {0,1,1,2,3,5,8}
    public static int[] fibonnacci(int num){
        // crio uma array de Ints com Num elementos
        int[] arrayFib = new int[num];
        // percorro a array para adicionar os elementos 1 a 1
        for (int i=0; i<num; i++){
            //Usando a função recursiva de apoio abaixo calculo o fibonnacci para cada um dos index
            arrayFib[i] = fib(i);
        }
        return arrayFib;
    }

    // criei uma função recursiva acessória para ajudar no exercicio acima usando a formula de fibonnacci
    public static int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n-1) + fib(n-2);
    }
}
