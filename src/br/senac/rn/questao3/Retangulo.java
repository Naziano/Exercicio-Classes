package br.senac.rn.questao3;

public class Retangulo {

    Double ladoA = 0.0;
    Double ladoB = 0.0;

    void mudarLado(Double valorLadoA, Double valorLadoB) {
    ladoA = valorLadoA;
    ladoB = valorLadoB;
    }

    Double retornarLadoA() {
    return ladoA;
    }

    Double retornarLadoB() {
        return ladoB;
    }

    Double calcularArea() {
    return ladoA * ladoB;
    }

    Double calcularPerimetro() {
    return ladoA + ladoB * 2;
    }



}
