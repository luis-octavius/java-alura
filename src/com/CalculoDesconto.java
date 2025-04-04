package com;
public class CalculoDesconto {
    public static void main(String[] args) {
        double precoOriginal = 45.0;
        double percentualDesconto = 10.0;

        double valorDesconto = (percentualDesconto / 100.0) * precoOriginal;
        double precoNovo = precoOriginal - valorDesconto;
        System.out.println("Preço original: R$" + precoOriginal);
        System.out.println("Desconto: R$" + valorDesconto);
        System.out.println("Preço com desconto: R$" + precoNovo);
    }
}