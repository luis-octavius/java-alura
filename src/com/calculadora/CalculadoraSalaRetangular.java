package com.calculadora;

public class CalculadoraSalaRetangular implements CalculoGeometrico {

    @Override
    public double calcularArea(double altura, double largura) {
        double area = altura * largura;
        System.out.println("A área é: " + area);
        return area;
    }

    @Override
    public double calcularPerimetro(double altura, double largura) {
        double perimetro = (altura + largura) * 2;
        System.out.println("O perimetro é: " + perimetro);
        return perimetro;
    }
}
