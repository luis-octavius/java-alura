package com;

public class ContaBancaria {
  private int numeroConta;
  private int saldo;
  public String titular;

  public void deposita(int valor) {
    saldo += valor;
  }

  public void saque(int valor) {
    if (valor > saldo) {
      System.out.println("Valor para saque não disponível.");
    } else {
      saldo -= valor;
    }
  }

  public int getSaldo() {
    return saldo;
  }

  public int getNumeroDaConta() {
    return numeroConta;
  }
}
