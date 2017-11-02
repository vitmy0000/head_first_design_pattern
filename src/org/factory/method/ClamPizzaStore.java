package org.factory.method;

public class ClamPizzaStore extends PizzaStore {
  public Pizza createPizza() {
    return new ClamPizza();
  }
}
