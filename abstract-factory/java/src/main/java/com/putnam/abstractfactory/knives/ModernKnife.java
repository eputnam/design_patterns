package com.putnam.abstractfactory.knives;

public class ModernKnife implements Knife{
  @Override
  public void printKind() {
    System.out.println("A modern knife!");
  }

  @Override
  public boolean hasBlade() {
    return true;
  }
}
