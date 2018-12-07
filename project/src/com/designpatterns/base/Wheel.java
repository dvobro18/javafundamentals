package com.designpatterns.base;

import com.designpatteerns.behavioral.Bearings;
import com.designpatteerns.behavioral.Spokes;

public class Wheel implements WheelInterface {
private int size;
private boolean isWide;
private Spokes spokes;
private Bearings bearings;
public Wheel(int size, boolean isWide) {
	this.size = size;
	this.isWide = isWide;

	spokes = new Spokes();
	bearings = new Bearings();
}

public int getSize() {
	return size;
	
}
public boolean isWide() {
	return isWide;
	
}
 public void acceptVisitor(WheelVisitorInterface visitor) {
	spokes.acceptVisitor(visitor);
	bearings.acceptVisitor(visitor);
	visitor.visit(this);
}
public String toString() {
	return getClass().getSimpleName() + "("+size+")";
}
}
