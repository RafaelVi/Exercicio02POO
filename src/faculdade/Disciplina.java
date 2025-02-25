package faculdade;

public class Disciplina {
    String nome;
    double nota1;
    double nota2;

    public Disciplina(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "{" +
                "nome:'" + nome + '\'' +
                ", nota1:" + nota1 + '\'' +
                ", nota2:" + nota2 + '\'' +
                ", status:" + (calculaStatus()? "Aprovado":"Reprovado") +
                '}';
    }

    boolean calculaStatus(){
       return (nota1 + nota2)/2 > 6;
    }
}
