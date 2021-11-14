package com.putnam.builder.bike;

class Bike {
    int wheelSize;
    RearHubType rearHubType;
    ShifterType shifterType;

    Bike(){}

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder
            .append("Wheel size: ")
            .append(wheelSize)
            .append("\n")
            .append("Rear hub type: ")
            .append(rearHubType)
            .append("\n")
            .append("Shifter type: ")
            .append(shifterType)
            .append("\n");

        return stringBuilder.toString();
    }
}
