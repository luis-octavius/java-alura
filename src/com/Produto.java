package com;

public class Product {
  private String name;
  private double price;

  public void setPrice(double price) {
    this.price = price;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void getDiscount(int value) {
    this.price = (price * value) / 100;
  }
}
