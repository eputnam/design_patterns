package com.putnam.abstractfactory.spoons;

public class ClassicSpoon implements Spoon{
  @Override
  public void printKind() {
    System.out.println("A classic spoon!");
  }

  @Override
  public boolean exists() {
    return true;
  }
}
