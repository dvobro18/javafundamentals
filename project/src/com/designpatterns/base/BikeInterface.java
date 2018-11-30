package com.designpatterns.base;

public interface BikeInterface {
public enum Color {UNPAINTED, CHROME, BLACK, RED, Color};
public default WheelInterface getWheel() {
	return null;
}
public default BikeInterface.Color getColor() {
	return null;
}
public default void paint(BikeInterface.Color color) {
}
}
