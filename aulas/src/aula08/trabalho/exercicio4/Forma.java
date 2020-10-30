package aula08.trabalho.exercicio4;

/*4. Implemente uma classe abstracta de nome Forma onde são declarados dois métodos
abstractos: float calcularArea(); e float cacularPerimetro();
a. Crie, como subclasse de Forma, uma classe de nome Rectangulo cujas
instâncias são caracterizadas pelos atributos lado e altura ambos do tipo float.
b. Implemente na classe Rectangulo os métodos herdados de Forma e outros que
ache necessários.
c. Crie, como subclasse de Forma, uma classe de nome Círculo cujas instâncias
são caracterizadas pelo atributo raio do tipo float.
d. Implemente na classe Circulo os métodos herdados de Forma e outros que
ache necessários. Dica: poderá aceder ao valor de Pi fazendo Math.Pi.
e. Crie, como subclasse de Rectangulo, uma classe de nome Quadrado cujas
instâncias são caracterizadas por terem os atributos lado e altura com o
mesmo valor.
f. Elabore um programa de teste onde é declarado um array, de dimensão 5, do
tipo Forma. Nesse array, devem ser guardadas instâncias de Rectangulo,
Circulo e Quadrado.
g. Depois, implemente um ciclo que percorra o array evocando, relativamente a
cada um dos objectos guardados, os métodos calcularArea e calcularPerimetro
e imprima a informação para o ecrâ.*/

public abstract class Forma {


    // Constructor vazio porque forma é um conceito abstracto, nao guarda nada
    public Forma(){}

    
    public abstract float calcularArea();
    public abstract float calcularPerimetro();
    
}
