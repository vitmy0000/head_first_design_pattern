package org.factory.method;

public class Main {
  public static void main(String[] args) {
    CheesePizzaStore store1 = new CheesePizzaStore();
    Pizza pizza1 = store1.orderPizza();
    ClamPizzaStore store2 = new ClamPizzaStore();
    Pizza pizza2 = store2.orderPizza();
  }
}
