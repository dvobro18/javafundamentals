package com.designpatterns.base;

public class Wheel implements WheelInterface {
private int size;
private boolean isWide;
public Wheel(int size, boolean isWide) {
	this.size = size;
	this.isWide = isWide;
	
}
public int getSize() {
	return size;
	
}
public boolean isWide() {
	return isWide;
	
}
public String toString() {
	return getClass().getSimpleName() + "("+size+")";
}
}
