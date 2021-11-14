package com.putnam.builder.bike;

public class BuildABike {
  public static void main(String[] args) {
    BikeDirector director = new BikeDirector(new FixieBikeBuilder());
    director.buildBike();
    Bike newBike = director.getBuilder().getBike();

    System.out.println("Hey, cool new bike!");
    System.out.println(newBike);
  }
}
