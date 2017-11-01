package org.singleton;

public class Main {
  public static void main(String[] args) {
    HungrySingleton hungry1 = HungrySingleton.getInstance();
    HungrySingleton hungry2 = HungrySingleton.getInstance();
    System.out.println(hungry1 == hungry2);

    LazySingleton lazy1 = LazySingleton.getInstance();
    LazySingleton lazy2 = LazySingleton.getInstance();
    System.out.println(lazy1 == lazy2);

    DoubleCheckLockSingleton dcl1 = DoubleCheckLockSingleton.getInstance();
    DoubleCheckLockSingleton dcl2 = DoubleCheckLockSingleton.getInstance();
    System.out.println(dcl1 == dcl2);
  }
}
