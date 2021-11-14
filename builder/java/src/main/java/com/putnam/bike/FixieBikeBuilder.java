package com.putnam.builder.bike;

class FixieBikeBuilder implements BikeBuilder{
  private Bike bike = new Bike();

  @Override
  public void setWheelSize() {
    bike.wheelSize = 27;
  }

  @Override
  public void setRearHubType() {
    bike.rearHubType = RearHubType.FIXED;
  }

  @Override
  public void setShifters() {
    bike.shifterType = null;
  }

  @Override
  public Bike getBike() {
    return bike;
  }
}
