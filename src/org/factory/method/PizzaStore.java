package org.factory.method;

public abstract class PizzaStore {
  protected abstract Pizza createPizza();

  public Pizza orderPizza() {
    Pizza pizza = createPizza();
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;
  }
}
