package com.putnam.abstractfactory.spoons;

public class ClassicSpoon implements Spoon{
  @Override
  public void create() {
    System.out.println("Created a classic spoon!");
  }

  @Override
  public boolean exists() {
    return true;
  }
}
