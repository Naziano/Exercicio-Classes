package br.senac.rn.questao2;

public class Quadrado {

    public Double lado = 0.0;

    public void mudaLado(Double novoLado) {
        lado = novoLado;
    }

    public Double mostraLado() {
        return lado;
    }

    public Double calculaArea() {
        return lado * lado;
    }

}
