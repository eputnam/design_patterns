package com.putnam.abstractfactory.forks;

public class ModernFork implements Fork{
  @Override
  public void printKind() {
    System.out.println("A modern fork!");
  }

  @Override
  public int getNumberOfTines() {
    return 5;
  }
}
