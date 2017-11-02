package org.factory.simple;

public class Main {
  public static void main(String[] args) {
    SimplePizzaFactory factory = new SimplePizzaFactory();
    Pizza pizza1 = factory.orderPizza("cheese");
    Pizza pizza2 = factory.orderPizza("veggie");
  }
}
