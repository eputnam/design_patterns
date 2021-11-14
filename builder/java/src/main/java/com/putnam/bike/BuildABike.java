package com.putnam.builder.bike;

import com.putnam.builder.bike.bikes.FixedGearBike;
import com.putnam.builder.bike.bikes.TouringBike;
import com.putnam.builder.bike.builders.FixieBikeBuilder;
import com.putnam.builder.bike.builders.TouringBikeBuilder;

/** Client class that calls the director */
public class BuildABike {
  public static void main(String[] args) {
    FixieBikeBuilder fixieBikeBuilder = new FixieBikeBuilder();
    TouringBikeBuilder touringBikeBuilder = new TouringBikeBuilder();

    /*
    The director should only need to know about the BikeBuilder interface and shouldn't care about what's passed in, as long as it implements the BikeBuilder.
     */
    BikeDirector director = new BikeDirector();

    // build a fixie
    director.buildBike(fixieBikeBuilder);
    FixedGearBike fixedGearBike = fixieBikeBuilder.getFixie();

    // build a touring bike
    director.buildBike(touringBikeBuilder);
    TouringBike touringBike = touringBikeBuilder.getBike();

    System.out.println("Hey, cool new bikes!");
    System.out.println(fixedGearBike);
    System.out.println(touringBike);
  }
}
