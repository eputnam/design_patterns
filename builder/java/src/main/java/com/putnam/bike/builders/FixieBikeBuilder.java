package com.putnam.builder.bike.builders;

import com.putnam.builder.bike.bikes.FixedGearBike;
import com.putnam.builder.bike.components.RearHubType;

public class FixieBikeBuilder implements BikeBuilder {
  int wheelSize;
  RearHubType rearHubType;

  @Override
  public void setWheelSize() {
    this.wheelSize = 27;
  }

  @Override
  public void setRearHubType() {
    this.rearHubType = RearHubType.FIXED;
  }

  @Override
  public void setShifters() {
    return;
  }

  public FixedGearBike getFixie() {
    return new FixedGearBike(wheelSize, rearHubType);
  }
}
