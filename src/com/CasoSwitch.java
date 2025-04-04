package com;
import java.util.Scanner;

public class CasoSwitch {
    public static void main(String[] args) {
        Scanner Dia = new Scanner(System.in);
        System.out.println("Digite o dia da semana: \n");

        int dia = Dia.nextInt();

        String nomeDia;
        switch (dia) {
            case 1:
                nomeDia = "segunda-feira";
                break;
            case 2:
                nomeDia = "terça";
                break;
            case 3:
                nomeDia = "quarta";
                break;
            case 4:
                nomeDia = "quinta";
                break;
            case 5:
                nomeDia = "sexta";
                break;
            case 6:
                nomeDia = "sábado";
                break;
            case 7:
                nomeDia = "domingo";
                break;
            default:
                nomeDia = "Inválido";
                break;
        }

        System.out.println("O dia " + dia + " é " + nomeDia);
    }
}
