package com.putnam.abstractfactory.factory;

import com.putnam.abstractfactory.forks.Fork;
import com.putnam.abstractfactory.forks.ModernFork;
import com.putnam.abstractfactory.knives.Knife;
import com.putnam.abstractfactory.knives.ModernKnife;
import com.putnam.abstractfactory.spoons.ModernSpoon;
import com.putnam.abstractfactory.spoons.Spoon;

public class ModernFlatwareFactory implements FlatwareFactory{
  @Override
  public Spoon buildSpoon() {
    return new ModernSpoon();
  }

  @Override
  public Fork buildFork() {
    return new ModernFork();
  }

  @Override
  public Knife buildKnife() {
    return new ModernKnife();
  }
}
