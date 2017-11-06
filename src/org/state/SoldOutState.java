package org.state;

public class SoldOutState implements State {
  private GumballMachine gumballMachine;

  public SoldOutState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  public void insertQuarter() {
    System.out.println("Sold out!");
  }

  public void ejectQuater() {
    System.out.println("Sold out!");
  }

  public void turnCrank() {
    System.out.println("Sold out!");
  }

  public void dispense() {
    System.out.println("Sold out!");
  }
}
