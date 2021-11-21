package com.putnam.abstractfactory;

import com.putnam.abstractfactory.factory.FlatwareFactory;
import com.putnam.abstractfactory.forks.Fork;
import com.putnam.abstractfactory.knives.Knife;
import com.putnam.abstractfactory.spoons.Spoon;

public class FlatwareApp {
  Spoon spoon;
  Fork fork;
  Knife knife;

  public FlatwareApp(FlatwareFactory factory) {
    this.fork = factory.buildFork();
    this.spoon = factory.buildSpoon();
    this.knife = factory.buildKnife();
  }

  public void printConfig() {
    System.out.println("Printing current flatware set:");
    this.fork.printKind();
    this.knife.printKind();
    this.spoon.printKind();
  }
}
