package com.putnam.abstractfactory.knives;

public class ClassicKnife implements Knife{
  @Override
  public void printKind() {
    System.out.println("A classic knife!");
  }

  @Override
  public boolean hasBlade() {
    return false;
  }
}
