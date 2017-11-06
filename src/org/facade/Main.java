package org.facade;

public class Main {
  public static void main(String[] args) {
    Amplifier amp = new Amplifier();
    Projector projector = new Projector();
    TheaterLights lights = new TheaterLights();
    HomeTheaterFacade homeTheater = new HomeTheaterFacade(
        amp, projector, lights);
    homeTheater.watchMovie();
    homeTheater.endMovie();
  }
}
