package com.designpatterns.creational;

import com.designpatterns.base.BikeInterface;

public class MountainBikeBuilder extends BikeBuilder {
private MountainBike mountainBikeProgress;
private Object mountainBikeInProgress;

public MountainBikeBuilder(MountainBike Bike) {
	this.mountainBikeInProgress = Bike;
	
}
@Override
public void buildWideTires() {
	System.out.println("Building Mountain Bike Wide Tires");
}
public void buildHandleBars() {
	System.out.println("Building Mountain Bike Handle Bars");
	
}
@Override
public BikeInterface getBike() {
	return (BikeInterface) mountainBikeInProgress;
}
}
