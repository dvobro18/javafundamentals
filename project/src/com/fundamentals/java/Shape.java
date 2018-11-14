package com.fundamentals.java;

public abstract class Shape {

	private int length;
	private int width;

	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}

	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}
 //abstract method with parameters must be overridden by a subclass
	abstract double area(double length,double width,double height);
	
	//abstract method must be overridden by a subclass.
	abstract double area();
	
	//abstract method must be overidden by a subclass.
	abstract String draw();
	/**
 * Since a static method doesn't support instances, it can be used in an
 * abstract class
 */

public static int area(int length, int width) { 
	return length * width;
}
}

