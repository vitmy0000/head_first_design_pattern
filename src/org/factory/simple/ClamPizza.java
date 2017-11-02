package org.factory.simple;

public class ClamPizza implements Pizza {
  public ClamPizza() {
    System.out.println("new ClamPizza!");
  }

  public void prepare() {
    System.out.println("prepare ClamPizza!");
  }

  public void bake() {
    System.out.println("bake ClamPizza!");
  }

  public void cut() {
    System.out.println("cut ClamPizza!");
  }

  public void box() {
    System.out.println("box ClamPizza!");
  }
}
