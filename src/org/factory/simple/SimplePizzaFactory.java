package org.factory.simple;

public class SimplePizzaFactory {
  public Pizza createPizza(String type) {
    Pizza pizza = null;
    if (type.equals("cheese")) {
      pizza = new CheesePizza();
    } else if (type.equals("pepperoni")) {
      pizza = new PepperoniPizza();
    } else if (type.equals("clam")) {
      pizza = new ClamPizza();
    } else if (type.equals("veggie")) {
      pizza = new VeggiePizza();
    }
    return pizza;
  }

  // second way to implements simple factory
  public Pizza createCheesePizza() {
    return new CheesePizza();
  }
  public Pizza createPepperoniPizza() {
    return new PepperoniPizza();
  }
  public Pizza createClamPizza() {
    return new ClamPizza();
  }
  public Pizza createVeggiePizza() {
    return new VeggiePizza();
  }
}
