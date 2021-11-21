package com.putnam.abstractfactory.knives;

public class ModernKnife implements Knife{
  @Override
  public void create() {
    System.out.println("Created a modern knife!");
  }

  @Override
  public boolean hasBlade() {
    return true;
  }
}
