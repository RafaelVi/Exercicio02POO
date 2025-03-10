package funcionarios;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    void aumentaSalario(double aumentoPercentual) {
        this.salario += salario * aumentoPercentual / 100;
    }

    void aumentaSalario(double aumentoPercentual, String cargo) {
        if (this.cargo.equals(cargo)) {
            aumentaSalario(aumentoPercentual);
        }
    }

    void promocao(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';
    }
}
