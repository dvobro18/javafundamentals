package com.designpatteerns.behavioral;

import java.util.ArrayList;
import java.util.List;

public class BikeSpeedometer {
private int currentSpeed;
private List<SpeedometerListener> listeners;
public BikeSpeedometer() {
	currentSpeed = 0;
	listeners = new ArrayList<SpeedometerListener>();
}
public void setCurrentSpeed(int speed) {
	this.currentSpeed = speed;
}
public int getCurrentspeed() {
	return currentSpeed;
}
public void addSpeedometerListener(SpeedometerListener obj) {
	listeners.add(obj);
}
public void removeSpeedometerListener(SpeedometerListener obj) {
	listeners.remove(obj);
}
protected void fireSpeedChanged() {
	SpeedometerEvent speddEvent = new SpeedometerEvent(this, getCurrentSpeed());
	for (SpeedometerListener listen: listeners) {
		SpeedometerEvent speedEvent = null;
		listen.speedChange(speedEvent);
	}
}
private int getCurrentSpeed() {
	// TODO Auto-generated method stub
	return 0;
}
}
