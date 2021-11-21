package com.putnam.abstractfactory.knives;

public class OrnateKnife implements Knife{
  @Override
  public void printKind() {
    System.out.println("An ornate knife!");
  }

  @Override
  public boolean hasBlade() {
    return false;
  }
}
