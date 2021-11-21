package com.putnam.abstractfactory.knives;

public class ClassicKnife implements Knife{
  @Override
  public void create() {
    System.out.println("Created a classic knife!");
  }

  @Override
  public boolean hasBlade() {
    return false;
  }
}
