package org.facade;

public class HomeTheaterFacade {
  private Amplifier amp;
  private Projector projector;
  private TheaterLights lights;

  public HomeTheaterFacade(Amplifier amp,
                           Projector projector,
                           TheaterLights lights) {
    this.amp = amp;
    this.projector = projector;
    this.lights = lights;
  }

  public void watchMovie() {
    amp.on();
    projector.on();
    lights.off();
  }

  public void endMovie() {
    amp.off();
    projector.off();
    lights.on();
  }
}
