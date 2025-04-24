package com.conversor;

public class ConversorMoeda implements ConversaoFinanceira{

    @Override
    public void converterDolarParaReal(double dolar) {
        double cotacaoDolar = 5.81;
        double valorReal = dolar * cotacaoDolar;
        System.out.println("O valor em reais é: R$ " + valorReal);
    }
}
