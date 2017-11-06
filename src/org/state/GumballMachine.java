package org.state;

public class GumballMachine {
  private State soldOutState;
  private State noQuarterState;
  private State hasQuarterState;
  private State soldState;

  private State state = soldOutState;
  private int count = 0;

  public GumballMachine(int count) {
    this.count = count;
    soldOutState = new SoldOutState(this);
    noQuarterState = new NoQuarterState(this);
    hasQuarterState = new HasQuarterState(this);
    soldState = new SoldState(this);
    state = noQuarterState;
  }

  public State getSoldOutState() {
    return soldOutState;
  }

  public State getNoQuarterState() {
    return noQuarterState;
  }

  public State getHasQuarterState() {
    return hasQuarterState;
  }

  public State getSoldState() {
    return soldState;
  }

  public void setState(State state) {
    this.state = state;
  }

  public int getCount() {
    return count;
  }

  public void releaseBall() {
    System.out.println("A gumball comes rolling out the slot...");
    if (count != 0) {
      count--;
    }
  }

  public void insertQuarter() {
    state.insertQuarter();
  }

  public void ejectQuater() {
    state.ejectQuater();
  }

  public void turnCrank() {
    state.turnCrank();
    state.dispense();
  }
}
