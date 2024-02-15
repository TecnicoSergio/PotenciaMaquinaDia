package PotenciaMaquina;

public class Potencia {

    float potencias = 20;
    float maiorValor;
    float menorValor;
    int i;

    public Potencia(float potencias, float maiorValor, float menorValor, int i) {
        this.potencias = potencias;
        this.maiorValor = maiorValor;
        this.menorValor = menorValor;
        this.i = i;
    }

    public float getPotencias() {
        return potencias;
    }

    public void setPotencias(float potencias) {
        this.potencias = potencias;
    }

    public float getMaiorValor() {
        return maiorValor;
    }

    public void setMaiorValor(float maiorValor) {
        this.maiorValor = maiorValor;
    }

    public float getMenorValor() {
        return menorValor;
    }

    public void setMenorValor(float menorValor) {
        this.menorValor = menorValor;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
