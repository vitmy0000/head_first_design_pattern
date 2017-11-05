package org.composite;

import java.util.*;

public class Menu extends MenuComponent {
  private ArrayList<MenuComponent> menuComponents =
    new ArrayList<MenuComponent>();
  private String name;
  private String description;

  public Menu(String name, String description) {
    this.name = name;
    this.description = description;
  }

  public void add(MenuComponent menuComponent) {
    menuComponents.add(menuComponent);
  }

  public void remove(MenuComponent menuComponent) {
    menuComponents.remove(menuComponent);
  }

  public MenuComponent getChild(int i) {
    return menuComponents.get(i);
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public void print() {
    System.out.print("\n" + getName());
    System.out.println(", " + getDescription());
    System.out.println("===========");

    Iterator<MenuComponent> iter = menuComponents.iterator();
    while (iter.hasNext()) {
      MenuComponent menuComponent = iter.next();
      menuComponent.print();
    }
  }
}
