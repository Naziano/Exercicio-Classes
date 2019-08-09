package br.senac.rn.questao3;

public class Retangulo {

    Double base = 0.0;
    Double altura = 0.0;

   public Retangulo() {}

   public Retangulo(Double base, Double altura) {
       this.base = base;
       this.altura = altura;
   }

   public void trocaAltura(Double novaAltura) {
       altura = novaAltura;
   }

   public void trocaBase(Double novaBase) {
       base = novaBase;
   }

   public Double mostraAltura() {
       return altura;
   }

   public Double mostraBase() {
       return base;
   }

   public Double calculaArea() {
       return  base * altura;
   }

   public Double calculaPerimetro() {
       return (base + altura) *2;
    }

}
