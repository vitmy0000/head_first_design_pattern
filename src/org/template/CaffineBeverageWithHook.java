package org.template;

public abstract class CaffineBeverageWithHook {
  public void prepareRecipe() {
    boilWater();
    brew();
    pourInCup();
    if (customerWantsCondiments()) {
      addCondiments();
    }
  }

  public abstract void brew();

  public abstract void addCondiments();

  public void boilWater() {
    System.out.println("Boiling water");
  }

  public void pourInCup() {
    System.out.println("Pouring into cup");
  }

  boolean customerWantsCondiments() {
    return true;
  }
}
