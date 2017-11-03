package org.factory.abs;

public class Main {
  public static void main(String[] args) {
    PizzaIngredientFactory ingredientFactory1 = new NYPizzaIngredientFactory();
    PizzaIngredientFactory ingredientFactory2 = new ChicagoPizzaIngredientFactory();
    createInfo(ingredientFactory1);
    createInfo(ingredientFactory2);
  }

  public static void createInfo(PizzaIngredientFactory ingredientFactory) {
    ingredientFactory.createDough().doughInfo();
    ingredientFactory.createSauce().SauceInfo();
    ingredientFactory.createCheese().CheeseInfo();
  }
}
