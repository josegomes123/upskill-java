package aula07.aula.Exercicio2;

/*Exercício 2 - Jogadores de Futebol
Pretende-se escrever um programa para registar as estatísticas de jogadores de futebol.
● A classe (base) Jogador deve conter o nome e o número do jogador. Deve também ter um
método para registar cada golo marcado e um inspetor para o número de golos marcados.
● A classe GuardaRedes, uma extensão de Jogador, que deve permitir registar e consultar o
número de golos sofridos.
● A classe JogadorDeCampo, uma extensão de Jogador, que deve permitir registar e
consultar o número de passes feitos e recebidos.
Teste criando um jogador de campo e um guarda-redes e use as funções próprias de cada classe
para atribuir a cada jogador (desde que seja possível): 2 golos marcados, 3 golos sofridos, 4 passes
feitos e 5 passes recebidos.
Sobreponha o método toString em ambas as classes para melhor visualizar os resultados do teste. */

public abstract class Jogador {
    //atributos
    private int num;
    private String nome;
    private int numGolos;

    // Constructor, começa com 0 golos marcados
    public Jogador(int num, String nome){
        this.num =num;
        this.nome = nome;
        this.numGolos = 0;
    }

    //Funções

    //Adiciona um golo marcado
    public void addGoal(){
        numGolos++;
    }

    //Setter
    public void setNumGolos(int numGolos) {
        this.numGolos = numGolos;
    }

    // Getter
    public int getNumGolos() {
        return numGolos;
    }

    public String getNome() {
        return nome;
    }

    public int getNum() {
        return num;
    }
}
