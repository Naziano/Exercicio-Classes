package br.senac.rn.questao3.teste3;

import br.senac.rn.questao3.Retangulo;

public class TesteRetangulo {

    public static void main(String[] args) {

        Double altura = 8.0;
        Double base = 7.0;

        Retangulo salaAula = new Retangulo(base, altura);

        Retangulo pisoSala = new Retangulo(0.45, 0.45);

        Retangulo rodapeSala = new Retangulo(0.45, 0.15);

        Double qtdPisos = salaAula.calculaArea() / pisoSala.calculaArea();

        System.out.println("Qtd pisos: " + qtdPisos);

        Double qtdRodape = salaAula.calculaPerimetro() / rodapeSala.mostraBase();
;
        System.out.println("Qtd rodape: " + qtdRodape);

    }

}
