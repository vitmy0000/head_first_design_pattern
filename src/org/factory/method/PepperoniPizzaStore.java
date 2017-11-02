package org.factory.method;

public class PepperoniPizzaStore extends PizzaStore {
  public Pizza createPizza() {
    return new PepperoniPizza();
  }
}
