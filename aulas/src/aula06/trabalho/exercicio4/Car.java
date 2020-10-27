package aula06.trabalho.exercicio4;


/* 4. Implemente a classe Car. Um carro possui algumas propriedades e caraterísticas que
variam de modelo para modelo, tais como a marca, o modelo, o número de lugares, a
matrícula, o mês e ano de registo, o consumo em 100km, etc… Certos atributos devem
ser indicados aquando a criação do carro.
Deve criar os testes que achar necessário para testar as funções desenvolvidas.
a. Desenvolva os getters e os setters dos atributos que lhe pareçam adequados.
b. O carro possui um tanque de combustível, com uma capacidade atual e uma
capacidade máxima. Implemente a função encherDeposito() que simula o
abastecimento.
c. A função run() deve simular o percurso feito pelo automóvel em 1 km. O
combustível associado a este percurso deve ser descontado na capacidade atual
do tanque.
d. Deve ser possível determinar se o carro se encontra em funcionamento.
Implemente a função isLigado() e outras que considera necessárias.
e. O automóvel possui um proprietário, que é representado pela classe Person
(desenvolvida na aula). Crie as funções e atributos necessários que permitem o
registo do proprietário à viatura.
f. Implemente a função toString() */


public class Car {
    //atributos
    private String marca;
    private String modelo;
    private int numLugares;
    private String matricula;
    private int mesRegisto;
    private int anoRegisto;
    private int consumo100;
    private double combustivelActual;
    private final double combustivelMaximo;
    private Person proprietario;

    // Contructor
    public Car(String marca, String modelo, int numLugares, int consumo100, double combustivelMaximo) {
        this.marca = marca;
        this.modelo = modelo;
        this.numLugares = numLugares;
        this.consumo100 = consumo100;
        this.combustivelMaximo = combustivelMaximo; //começa com deposito cheio
        this.combustivelActual = combustivelMaximo;
    }

    // Getters e Setters
    public int getAnoRegisto() {
        return anoRegisto;
    }

    public void setAnoRegisto(int anoRegisto) {
        this.anoRegisto = anoRegisto;
    }

    public int getMesRegisto() {
        return mesRegisto;
    }

    public void setMesRegisto(int mesRegisto) {
        this.mesRegisto = mesRegisto;
    }

    public int getNumLugares() {
        return numLugares;
    }

    public String getMarca() {
        return marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public int getConsumo100() {
        return consumo100;
    }

    public double getCombustivelActual() {
        return combustivelActual;
    }

    public void setCombustivelActual(double combustivelActual) {
        this.combustivelActual = combustivelActual;
    }

    public double getCombustivelMaximo() {
        return combustivelMaximo;
    }

    //retorna proprietario
    public Person getProprietario() {
        return proprietario;
    }

    public void setProprietario(Person proprietario) {
        this.proprietario = proprietario;
    }

//Operações

    // Enche o deposito completo
    public void encherDeposito() {
        setCombustivelActual(getCombustivelMaximo());
    }

    // Calcula o combustivel gasto ao andar  X kms e decrementa no combustivel actual
    public void run(int kms) {
        double consumoPorKM = (double) getConsumo100() / 100.0;
        double consumoTotal = (double) (consumoPorKM * kms);
        this.combustivelActual = getCombustivelActual() - consumoTotal;
    }

    public void isLigado() {
        // Assumo que se o combustivel estiver a ser gasto (menor que o maximo)
        // entao o carro esta ligado e em funcionamento
        if (getCombustivelActual() < getCombustivelMaximo()) {
            System.out.println("O carro encontra-se em funcionamento");
        } else {
            System.out.println("O carro está parado");
        }

    }

    // Registar um proprietario no carro
    public void registoProprietario(Person pessoa, int mesRegisto, int anoRegisto, String matricula) {
        setProprietario(pessoa);
        setMesRegisto(mesRegisto);
        setAnoRegisto(anoRegisto);
        setMatricula(matricula);
    }

    @Override
    public String toString() {
        return "Car{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", numLugares=" + numLugares +
                ", matricula='" + matricula + '\'' +
                ", mesRegisto=" + mesRegisto +
                ", anoRegisto=" + anoRegisto +
                ", proprietario=" + proprietario +
                '}';
    }
}
