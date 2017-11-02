package org.factory.method;

public class CheesePizza implements Pizza {
  public CheesePizza() {
    System.out.println("new CheesePizza!");
  }

  public void prepare() {
    System.out.println("prepare CheesePizza!");
  }

  public void bake() {
    System.out.println("bake CheesePizza!");
  }

  public void cut() {
    System.out.println("cut CheesePizza!");
  }

  public void box() {
    System.out.println("box CheesePizza!");
  }
}
