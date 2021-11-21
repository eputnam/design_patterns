package com.putnam.abstractfactory.forks;

public class ModernFork implements Fork{
  @Override
  public void create() {
    System.out.println("Created a modern fork!");
  }

  @Override
  public int getNumberOfTines() {
    return 5;
  }
}
