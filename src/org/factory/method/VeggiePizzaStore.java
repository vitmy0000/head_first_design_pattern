package org.factory.method;

public class VeggiePizzaStore extends PizzaStore {
  public Pizza createPizza() {
    return new VeggiePizza();
  }
}
