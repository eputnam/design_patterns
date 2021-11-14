package com.putnam.builder.bike.builders;

import com.putnam.builder.bike.bikes.TouringBike;
import com.putnam.builder.bike.components.RearHubType;
import com.putnam.builder.bike.components.ShifterType;

public class TouringBikeBuilder implements BikeBuilder {
  int wheelSize;
  RearHubType rearHubType;
  ShifterType shifterType;

  @Override
  public void setWheelSize() {
    this.wheelSize = 26;
  }

  @Override
  public void setRearHubType() {
    this.rearHubType = RearHubType.FREEWHEEL;
  }

  @Override
  public void setShifters() {
    this.shifterType = ShifterType.BAREND;
  }

  public TouringBike getBike() {
    return new TouringBike(wheelSize, rearHubType, shifterType);
  }
}
