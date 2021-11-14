package com.putnam.builder.bike;

import com.putnam.builder.bike.builders.BikeBuilder;

public class BikeDirector {
  BikeDirector() {}

  void buildBike(BikeBuilder builder) {
    builder.setWheelSize();
    builder.setRearHubType();
    builder.setShifters();
  }
}
