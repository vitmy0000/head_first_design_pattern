package org.observer;

public class Main {
  public static void main(String[] args) {
    WeatherData weatherData = new WeatherData();
    Display display = new Display(weatherData);
    weatherData.registerObserver(display);

    weatherData.setTemperature(80.0f);
    weatherData.setTemperature(90.0f);
    weatherData.setTemperature(100.0f);
  }
}
