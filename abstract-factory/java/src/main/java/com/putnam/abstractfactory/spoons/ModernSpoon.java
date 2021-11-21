package com.putnam.abstractfactory.spoons;

public class ModernSpoon implements Spoon{
  @Override
  public void create() {
    System.out.println("Created a modern spoon!");
  }

  @Override
  public boolean exists() {
    return false;
  }
}
