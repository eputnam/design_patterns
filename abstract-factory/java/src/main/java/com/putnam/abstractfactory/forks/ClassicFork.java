package com.putnam.abstractfactory.forks;

import com.putnam.abstractfactory.forks.Fork;

public class ClassicFork implements Fork {
  @Override
  public void printKind() {
    System.out.println("A classic fork!");
  }

  @Override
  public int getNumberOfTines() {
    return 4;
  }
}
