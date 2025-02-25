package faculdade;

import org.apache.sling.commons.json.JSONObject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Disciplina a = new Disciplina("Gestao Corporativa");
        Disciplina b = new Disciplina("Codigos de Alta Perfomance");
        Disciplina c = new Disciplina("Programacao Orientada a objetos");

        Aluno aluno = new Aluno();
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o nome do aluno?");
        aluno.nome = sc.nextLine();
        aluno.disciplinas = new Disciplina[]{a, b, c};

        for (int i = 0; i < aluno.disciplinas.length; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Qual a nota " + (j + 1) + " do aluno na disciplina " +
                        aluno.disciplinas[i].nome);
                if (j == 0) aluno.disciplinas[i].nota1 = sc.nextDouble();
                else aluno.disciplinas[i].nota2 = sc.nextDouble();
            }
        }


        JSONObject jsObject = new JSONObject(aluno.toString());

        System.out.println(jsObject.toString(4));

    }
}
