package com;
import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o seu filme preferido: ");
        String filme = leitura.nextLine();
        System.out.println(filme);

        System.out.println("Qual o ano de lançamento?");
        int anoDeLancamento = leitura.nextInt();
        System.out.println(anoDeLancamento);
    }
}
