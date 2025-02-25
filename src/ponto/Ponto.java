package ponto;

public class Ponto {
    int x;
    int y;

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int calculaDistancia(Ponto d) {
        return (int) Math.sqrt(Math.pow((x - d.x), 2) + Math.pow((y - d.y), 2));
    }

    int calculaPontoDeOrigem() {
        return calculaDistancia(new Ponto(0, 0));
    }

    static String comparaPontosParaOrigem(Ponto a, Ponto b) {
        int distA = a.calculaPontoDeOrigem();
        int distB = b.calculaPontoDeOrigem();

        if (distA < distB) {
            return "Primeiro ponto";
        } else if (distB < distA) {
            return "Segundo ponto";
        }

        return "Distância igual entre os pontos";
    }

    String coordenada() {
        return "(" + x + "," + y + ")";
    }
}
