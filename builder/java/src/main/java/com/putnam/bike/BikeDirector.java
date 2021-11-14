package com.putnam.builder.bike;

public class BikeDirector {
  BikeBuilder builder;

  BikeDirector(BikeBuilder bikeBuilder) {
    this.builder = bikeBuilder;
  }

  void buildBike(){
    this.builder.setWheelSize();
    this.builder.setRearHubType();
    this.builder.setShifters();
  }

  BikeBuilder getBuilder() {
    return this.builder;
  }
}
