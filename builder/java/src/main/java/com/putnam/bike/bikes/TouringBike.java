package com.putnam.builder.bike.bikes;

import com.putnam.builder.bike.components.RearHubType;
import com.putnam.builder.bike.components.ShifterType;

public class TouringBike {
  int wheelSize;
  RearHubType rearHubType;
  ShifterType shifterType;

  public TouringBike(int wheelSize, RearHubType rearHubType, ShifterType shifterType) {
    this.wheelSize = wheelSize;
    this.rearHubType = rearHubType;
    this.shifterType = shifterType;
  }
}
