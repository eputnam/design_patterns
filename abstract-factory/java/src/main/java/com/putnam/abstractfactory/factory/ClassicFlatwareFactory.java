package com.putnam.abstractfactory.factory;

import com.putnam.abstractfactory.forks.ClassicFork;
import com.putnam.abstractfactory.forks.Fork;
import com.putnam.abstractfactory.knives.ClassicKnife;
import com.putnam.abstractfactory.knives.Knife;
import com.putnam.abstractfactory.spoons.ClassicSpoon;
import com.putnam.abstractfactory.spoons.Spoon;

public class ClassicFlatwareFactory implements FlatwareFactory{
  @Override
  public Spoon buildSpoon() {
    return new ClassicSpoon();
  }

  @Override
  public Fork buildFork() {
    return new ClassicFork();
  }

  @Override
  public Knife buildKnife() {
    return new ClassicKnife();
  }
}
