package ponto;

public class Main {
    public static void main(String[] args) {
        Ponto a = new Ponto(2,2);
        Ponto b = new Ponto(7,7);

        System.out.println(a.calculaDistancia(b));
        System.out.println(b.calculaDistancia(a));

        System.out.println(b.calculaPontoDeOrigem());
        System.out.println(a.coordenada());

        System.out.println(Ponto.comparaPontosParaOrigem(a, b));

    }
}
