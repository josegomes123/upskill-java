package aula10.trabalho.exercicio3;

public class Contacto implements Comparable<Contacto> {
    private String nome;
    private int numTel;

    public Contacto(String nome, int numTel) {
        this.nome = nome;
        this.numTel = numTel;
    }

    //Getter e Setters
    public String getNome() {
        return nome;
    }
    public int getNumTel() {
        return numTel;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNumTel(int numTel) {
        this.numTel = numTel;
    }

    @Override
    public String toString() {
        return nome + " - " + numTel;
    }

    @Override
    public int compareTo(Contacto contacto) {
        // CompareToIgnore case nao é case sensitive, portanto ignora as maiusculas na comparaçao
        if ((nome.compareToIgnoreCase(contacto.nome)) >0) {
            return 1;
        } else if ((nome.compareToIgnoreCase(contacto.nome)) < 0) {
            return -1;
        } else {
            // Se os nomes forem iguais (compareTo = 0 ) ordena pelo numero
            // Neste caso tem de se fazer outro teste ao num dentro da comparacao do nome
            if (numTel> contacto.numTel){
                return 1;
            } else if (numTel < contacto.numTel){
                return -1;
            } else {
                return 0;
            }
        }
    }
}
