package entities;

import java.io.Serializable;

public class Product implements Serializable {
  private String name;
  private double price;
  private int quantity;

  public Product(String name, double price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  @Override
  public String toString() {
    return (getClass().getName() + "[name=" + name + ", price=" + price + ", quantity=" + quantity + "]");
  }
}
