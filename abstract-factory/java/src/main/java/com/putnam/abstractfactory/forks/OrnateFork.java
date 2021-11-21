package com.putnam.abstractfactory.forks;

public class OrnateFork implements Fork {
  @Override
  public void create() {
    System.out.println("Created an ornate fork!");
  }

  @Override
  public int getNumberOfTines() {
    return 3;
  }
}
