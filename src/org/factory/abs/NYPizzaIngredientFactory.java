package org.factory.abs;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
  public Dough createDough() {
    return new NYDough();
  }

  public Sauce createSauce() {
    return new NYSauce();
  }

  public Cheese createCheese() {
    return new NYCheese();
  }
 }
