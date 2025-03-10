package funcionarios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome do func");
        String nome = sc.nextLine();

        System.out.println("Cargo do func");
        String cargo = sc.nextLine();

        System.out.println("Salario base do func");
        double salario = sc.nextDouble();
        Funcionario funcionario = new Funcionario(nome,
                cargo,
                salario);


        funcionario.aumentaSalario(5);

        funcionario.aumentaSalario(2, "Gerente");//Não ira aumentar

        funcionario.promocao("PRESIDENTE DOS ESTADOS UNIDOS");
        funcionario.aumentaSalario(3, "PRESIDENTE DOS ESTADOS UNIDOS");

        System.out.println(funcionario);
    }
}
