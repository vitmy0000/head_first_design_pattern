package org.factory.method;

public class PepperoniPizza implements Pizza {
  public PepperoniPizza() {
    System.out.println("new PepperoniPizza!");
  }

  public void prepare() {
    System.out.println("prepare PepperoniPizza!");
  }

  public void bake() {
    System.out.println("bake PepperoniPizza!");
  }

  public void cut() {
    System.out.println("cut PepperoniPizza!");
  }

  public void box() {
    System.out.println("box PepperoniPizza!");
  }
}
