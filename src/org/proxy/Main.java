package org.proxy;

import java.lang.reflect.Proxy;

public class Main {
  public static void main(String[] args) {
    PersonBean joe = new PersonBeanImpl();
    joe.setName("Joe");
    joe.setGender("Male");
    joe.setInterests("Bowling");

    PersonBean ownerProxy = (PersonBean) Proxy.newProxyInstance(
        joe.getClass().getClassLoader(),
        joe.getClass().getInterfaces(),
        new OwnerInvocationHandler(joe));

    System.out.println("Name is " + ownerProxy.getName());
    ownerProxy.setInterests("Volleyball");
    System.out.println("Interests set from owner proxy");

    try {
      ownerProxy.setHotOrNotRating(10);
    } catch (Exception e) {
      System.out.println("Can't set rating from owner proxy");
    }
    System.out.println("Rating is " + ownerProxy.getHotOrNotRating());
  }
}
