package org.observer;

import java.util.*;

public class WeatherData implements Subject {
  private ArrayList<Observer> observers = new ArrayList<Observer>();
  private float temperature = 0;

  public void registerObserver(Observer o) {
    observers.add(o);
  }

  public void removeObserver(Observer o) {
    int i = observers.indexOf(o);
    if (i >= 0) {
      observers.remove(i);
    }
  }

  public void notifyObservers() {
    for (Observer o : observers) {
      o.update();
    }
  }

  public float getTemperature() {
    return temperature;
  }

  public void setTemperature(float temperature) {
    this.temperature = temperature;
    notifyObservers();
  }

}
