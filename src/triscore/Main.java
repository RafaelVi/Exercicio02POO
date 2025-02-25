package triscore;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao TriScore!");
        System.out.println("Qual o nome do jogador?");

        String nome = scanner.nextLine();
        Jogador jogador = new Jogador();

        jogador.nome = nome;
        Random rd = new Random();
        for (int i = 0; i < jogador.pontuacao.length; i++) {
            jogador.pontuacao[i] = Math.floor(rd.nextDouble(100));
        }

        System.out.println(jogador);
    }
}
