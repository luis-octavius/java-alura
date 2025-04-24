package com.listas;

import java.util.ArrayList;
import java.util.Collections;

public class Titulo implements Comparable <Titulo> {
    String nome;

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.nome.compareTo(outroTitulo.nome);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }

    public static void main(String[] args) {
        ArrayList<Titulo> listaTitulos = new ArrayList<>();
        Titulo titulo1 = new Titulo();
        titulo1.setNome("Avatar");

        Titulo titulo2 = new Titulo();
        titulo2.setNome("Melancholia");

        Titulo titulo3 = new Titulo();
        titulo3.setNome("Duna");

        listaTitulos.add(titulo1);
        listaTitulos.add(titulo2);
        listaTitulos.add(titulo3);

        Collections.sort(listaTitulos);

        for (Titulo titulo: listaTitulos) {
            System.out.println(titulo.toString());
        }
    }
}
