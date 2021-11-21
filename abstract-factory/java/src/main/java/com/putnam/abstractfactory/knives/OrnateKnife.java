package com.putnam.abstractfactory.knives;

public class OrnateKnife implements Knife{
  @Override
  public void create() {
    System.out.println("Created an ornate knife!");
  }

  @Override
  public boolean hasBlade() {
    return false;
  }
}
