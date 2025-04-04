package com;

public class Condicional {
    public static void main(String[] args) {
        int anoDeLançamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        if (anoDeLançamento >= 2022) {
            System.out.println("Esse os clientes estão curtindo!");
        } else {
            System.out.println("Filme antigo que vale a pena");
        }

        String tipoPlano = "plus";

        if (incluidoNoPlano || tipoPlano.equals("plus")) {
            System.out.println("Filme liberado");
        }
    }
}