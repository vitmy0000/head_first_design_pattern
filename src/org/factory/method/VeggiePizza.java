package org.factory.method;

public class VeggiePizza implements Pizza {
  public VeggiePizza() {
    System.out.println("new VeggiePizza!");
  }

  public void prepare() {
    System.out.println("prepare VeggiePizza!");
  }

  public void bake() {
    System.out.println("bake VeggiePizza!");
  }

  public void cut() {
    System.out.println("cut VeggiePizza!");
  }

  public void box() {
    System.out.println("box VeggiePizza!");
  }
}
