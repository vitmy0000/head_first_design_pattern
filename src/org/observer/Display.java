package org.observer;

public class Display implements Observer {
  private WeatherData weatherData;

  public Display(WeatherData weatherData) {
    this.weatherData = weatherData;
  }

  public void update() {
    System.out.println("Temperature: " + weatherData.getTemperature());
  }
}
