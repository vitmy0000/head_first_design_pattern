package org.factory.simple;

public class Main {
  public static void main(String[] args) {
    SimplePizzaFactory factory = new SimplePizzaFactory();
    Pizza pizza = factory.createPizza("cheese");
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    pizza = factory.createClamPizza();
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
  }
}
