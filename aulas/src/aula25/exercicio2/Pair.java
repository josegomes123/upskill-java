package aula25.exercicio2;

// Classe com 2 tipos genericos
public class Pair<K, V> {
    K tipo1;
    V tipo2;

    public Pair(K tipo1, V tipo2){
        this.tipo1 = tipo1;
        this.tipo2 = tipo2;
    }

    public K getTipo1() {
        return tipo1;
    }

    public V getTipo2() {
        return tipo2;
    }

    public void setTipo1(K tipo1) {
        this.tipo1 = tipo1;
    }

    public void setTipo2(V tipo2) {
        this.tipo2 = tipo2;
    }
}