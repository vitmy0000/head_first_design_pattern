package org.factory.simple;

public class Main {
  public static void main(String[] args) {
    PizzaStore store = new PizzaStore();
    Pizza pizza1 = store.orderPizza("cheese");
    Pizza pizza2 = store.orderPizza("veggie");
  }
}
