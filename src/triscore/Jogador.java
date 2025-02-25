package triscore;

import java.util.Arrays;

public class Jogador {
    String nome;
    double[] pontuacao = new double[3];

    @Override
    public String toString() {
        return "Jogador " + " \n" +
                "nome: " + nome + '\n' +
                "pontuacao: " + mostraPontuacao() +
                "total: " + calculaTotal();
    }

    private double calculaTotal() {
        double sum = 0;
        for (double rodada : pontuacao) {
            sum += rodada;
        }
        return sum;
    }

    private String mostraPontuacao() {
        String resultado = "";
        for (int i = 1; i <= pontuacao.length; i++) {
            resultado += "Round " + i + ": " + pontuacao[i-1] + "\n";
        }

        return resultado;
    }
}
