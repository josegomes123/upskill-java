package aula06.trabalho.exercicio1;

//1. Crie um sistema de gestão de alunos numa sala. Para tal, deverá criar as classes Room e
//Student. Cada sala tem a sua capacidade, o nome do bloco (ex: A, B, C, D) e o número
//da sala. Cada aluno terá o número de aluno, o nome e o curso. Deve ser possível realizar
//as seguintes operações:
//a. adicionar alunos a uma sala (até ao limite da sua capacidade)
//b. remover um aluno específico, com base no seu número
//c. listar todos os alunos que estão na sala

public class Room {
    // atributos
    private String nomeBloco;
    private Student[] listaAlunos;
    private int alunosActuais = 0;
    private int capacidade;
    private int numSala;

    //Constructor
    public Room(String nomeBloco, int capacidade, int numSala){
        this.nomeBloco = nomeBloco;
        this.listaAlunos = new Student[capacidade];
        this.numSala = numSala;
        this.alunosActuais++;
    }

    // Getters e Setters
    public String getBloco(){
        return nomeBloco;
    }

    public int getNumSala(){
        return numSala;
    }

    public int getCapacidade(){
        return capacidade;
    }

    public int getAlunosActuais(){
        return alunosActuais;
    }

    //Guarda aluno numa sala
    public void addStudent(Room sala, Student aluno){
        // verifica se a sala já está cheia, só adiciona aluno se houver lugares vazios
        if (sala.alunosActuais >= sala.capacidade){
            sala.listaAlunos[sala.alunosActuais] = aluno;
        } else {
            System.out.println("Nao é possivel adicionar aluno à sala, ja se encontra cheia");
        }
    }

    // Remover aluno de uma sala
    public void removeAluno(Room sala, Student aluno){
        // Obtenho o numero do aluno a remover
        int numAluno =  aluno.getNumAluno();
        // Percorro a array da sala que guarda os alunos (listaAlunos)
        for (int i = 0; i<sala.getCapacidade(); i++){
            // Se o num aluno a remover for igual ao numero aluno da posiçao actual da lista, remove esse aluno
            if (numAluno == listaAlunos[i].getNumAluno()){
                sala.listaAlunos[i] = null;
            }
        }
    }

    // Listar todos alunos numa sala
    public void listarAlunos(Room sala){
        // Percorro a array da sala que guarda os alunos (listaAlunos)
        for (int i = 0; i<sala.getCapacidade(); i++){
            // Usando o metodo toString() que defini na classe Student, imprimo cada aluno na lista
            System.out.println(listaAlunos[i].toString());
        }
    }

}
