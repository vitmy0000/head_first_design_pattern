package org.iterator;

import java.util.Iterator;

public class Waitress {
  private Menu pancakeHouseMenu;
  private Menu dinerMenu;

  public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
    this.pancakeHouseMenu = pancakeHouseMenu;
    this.dinerMenu = dinerMenu;
  }

  public void printMenu() {
    Iterator<MenuItem> pancakeHouseMenuIterator =
        pancakeHouseMenu.createIterator();
    Iterator<MenuItem> dinerMenuIterator = dinerMenu.createIterator();
    System.out.println("MENU\n---\nBREAKFAST");
    printMenu(pancakeHouseMenuIterator);
    System.out.println("MENU\n---\nDINER");
    printMenu(dinerMenuIterator);
  }

  public void printMenu(Iterator<MenuItem> iter) {
    while (iter.hasNext()) {
      MenuItem menuItem = iter.next();
      System.out.print(menuItem.getName() + ", ");
      System.out.print(menuItem.getPrice() + " -- ");
      System.out.println(menuItem.getDescription());
    }
  }
}
