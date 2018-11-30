package com.designpatterns.base;

public abstract class AbstractBike implements BikeInterface {
private WheelInterface wheel;
private BikeInterface.Color color;

AbstractBike(WheelInterface wheel) {
	this(wheel, BikeInterface.Color.UNPAINTED);
	
}
public AbstractBike(WheelInterface wheel2, Color unpainted) {
	// TODO Auto-generated constructor stub
}
public void AbstracrBike(WheelInterface wheel, BikeInterface.Color color) {
	this.wheel = wheel;
	this.color = color;
	
}
public WheelInterface getWheel() {
	return wheel;
	
}
public BikeInterface.Color getColor(){
	return color;
	
}
public void paint(BikeInterface.Color color) {
	this.color = color;
}
public String toString() {
	return getClass().getSimpleName() + '('+wheel+","+color+")";
}
}
