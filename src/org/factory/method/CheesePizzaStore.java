package org.factory.method;

public class CheesePizzaStore extends PizzaStore {
  public Pizza createPizza() {
    return new CheesePizza();
  }
}
