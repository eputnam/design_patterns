package com.putnam.abstractfactory.spoons;

public class ModernSpoon implements Spoon{
  @Override
  public void printKind() {
    System.out.println("A modern spoon!");
  }

  @Override
  public boolean exists() {
    return false;
  }
}
