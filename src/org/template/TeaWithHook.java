package org.template;

public class TeaWithHook extends CaffineBeverageWithHook {
  public void brew() {
    System.out.println("Steeping the tea");
  }

  public void addCondiments() {
    System.out.println("Adding lemon");
  }
}
