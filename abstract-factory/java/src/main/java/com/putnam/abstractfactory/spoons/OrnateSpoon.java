package com.putnam.abstractfactory.spoons;

public class OrnateSpoon implements Spoon{
  @Override
  public void printKind() {
    System.out.println("An ornate spoon!");
  }

  @Override
  public boolean exists() {
    return true;
  }
}
