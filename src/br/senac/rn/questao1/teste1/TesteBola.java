package br.senac.rn.questao1.teste1;

import br.senac.rn.questao1.Bola;

public class TesteBola {

    public static void main(String[] args) {

        Bola bolaFutebol = new Bola();

        bolaFutebol.cor = "azul";
        bolaFutebol.circunferencia = 0.5;
        bolaFutebol.material = "couro";

        System.out.println(bolaFutebol.mostraCor());

        bolaFutebol.trocaCor("vermelho");

        System.out.println(bolaFutebol.mostraCor());
    }

}
