package com;
import java.util.Scanner;

public class Loop {
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
    double mediaAvaliacao = 0;
    double avaliacao = 0;

    for (int i = 0; i < 3; i++) {
      System.out.println("Diga sua avaliacao para o filme ");
      double nota = leitura.nextDouble();
      mediaAvaliacao += nota;
    }
    System.out.println("Média de avaliações: " + mediaAvaliacao);
  }
}
