package com.putnam.abstractfactory.factory;

import com.putnam.abstractfactory.forks.Fork;
import com.putnam.abstractfactory.forks.OrnateFork;
import com.putnam.abstractfactory.knives.Knife;
import com.putnam.abstractfactory.knives.OrnateKnife;
import com.putnam.abstractfactory.spoons.OrnateSpoon;
import com.putnam.abstractfactory.spoons.Spoon;

public class OrnateFlatwareFactory implements FlatwareFactory{
  @Override
  public Spoon buildSpoon() {
    return new OrnateSpoon();
  }

  @Override
  public Fork buildFork() {
    return new OrnateFork();
  }

  @Override
  public Knife buildKnife() {
    return new OrnateKnife();
  }
}
