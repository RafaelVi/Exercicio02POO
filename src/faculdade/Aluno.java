package faculdade;

import java.util.Arrays;

public class Aluno {
    static int contador = 0;
    int matricula;
    String nome;
    Disciplina[] disciplinas = new Disciplina[3];

    public Aluno() {
        contador++;
        this.matricula = contador;
    }

    @Override
    public String toString() {
        return "{" +
                "matricula:" + matricula  +
                ", nome:'" + nome + '\'' +
                ", disciplinas:" + Arrays.toString(disciplinas) +
                '}';
    }
}
