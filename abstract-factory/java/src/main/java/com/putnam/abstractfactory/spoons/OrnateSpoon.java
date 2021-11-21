package com.putnam.abstractfactory.spoons;

public class OrnateSpoon implements Spoon{
  @Override
  public void create() {
    System.out.println("Created an ornate spoon!");
  }

  @Override
  public boolean exists() {
    return true;
  }
}
