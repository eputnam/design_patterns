package com.putnam.abstractfactory.forks;

public class OrnateFork implements Fork {
  @Override
  public void printKind() {
    System.out.println("An ornate fork!");
  }

  @Override
  public int getNumberOfTines() {
    return 3;
  }
}
