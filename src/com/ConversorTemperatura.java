package com;
import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner temperatura = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius, por favor, meu nobre: ");
        int temp = temperatura.nextInt();

        double conversaoTemp = (temp * 1.8) + 32;
        System.out.println(String.format("A temperatura em fahrenheit é %.2f", conversaoTemp));
    }
}
