package com.putnam.builder.bike;

interface BikeBuilder {
    void setWheelSize();
    void setRearHubType();
    void setShifters();
    Bike getBike();
}