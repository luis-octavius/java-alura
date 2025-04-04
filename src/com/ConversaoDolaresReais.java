package com;
public class ConversaoDolaresReais {
    public static void main(String[] args) {
        double precoProduto = 10.99;
        int quantidade = 5;

        double valorEmDolares = 5.99;
        double taxaDeConversão = 4.94;
        double conversion = valorEmDolares * taxaDeConversão;
        System.out.println(conversion);
    }
}
