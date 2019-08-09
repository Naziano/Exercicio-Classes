package br.senac.rn.questao4;

public class Pessoa {

    private String nome = "Jose";
    private Integer idade = 0.0;
    private Double peso = 0.0;
    private Double altura = 0.0;

    public Pessoa()

    public void envelhecer(Integer qtdAnos) {
        idade += qtdAnos;
        if (idade <= 21) {

        }
    }

    public void engordar() {
    return peso;
    }

    public void emagrecer() {
    return peso;
    }

    public void crescer(Double qtdAltura) {
        altura += qtdAltura;
    }
}
