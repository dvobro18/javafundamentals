package com.designpatteerns.behavioral;

import java.util.EventObject;

public class SpeedometerEvent extends EventObject {
private static final long serialVersionUID = 1L;
private int speed;
public SpeedometerEvent(Object source, int speed) {
	super(source);
	this.speed = speed;
}
public int getSpeed() {
	return speed;
}
}
