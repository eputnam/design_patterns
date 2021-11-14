package com.putnam.builder.bike.bikes;

import com.putnam.builder.bike.components.RearHubType;

public class FixedGearBike {
  int wheelSize;
  RearHubType rearHubType;

  public FixedGearBike(int wheelSize, RearHubType rearHubType) {
    this.wheelSize = wheelSize;
    this.rearHubType = rearHubType;
  }
}
