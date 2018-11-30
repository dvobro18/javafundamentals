package com.designpatterns.base;

public class CrossCountryBike extends MountianBike {
public CrossCountryBike(WheelInterface wheel) {
	this(wheel, BikeInterface.Color.UNPAINTED);
}
public CrossCountryBike(WheelInterface wheel, BikeInterface.Color color){
	super(wheel, color);
}
}
