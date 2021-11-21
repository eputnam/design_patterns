package com.putnam.abstractfactory.factory;

import com.putnam.abstractfactory.forks.Fork;
import com.putnam.abstractfactory.knives.Knife;
import com.putnam.abstractfactory.spoons.Spoon;

public interface FlatwareFactory {
  Spoon buildSpoon();
  Fork buildFork();
  Knife buildKnife();
}
