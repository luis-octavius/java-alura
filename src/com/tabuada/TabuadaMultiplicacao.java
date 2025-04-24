package com.tabuada;

public class TabuadaMultiplicacao implements Tabuada {
    int numero;

    public TabuadaMultiplicacao(int numero) {
        this.numero = numero;
    }

    @Override
    public void mostrarTabuada() {
        int i = 1;
        System.out.println("Tabuada do " + numero);
        System.out.println("---------------------");
        while (i < 10) {
            System.out.println(i * numero);
            i++;
        }
        System.out.println("---------------------");
    }
}
