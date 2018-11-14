package com.fundamentals.java;

class House {
	private String windows;
	String doors;
	private boolean hasStairs;
	public int length;

	House() {
		// TODO Auto-generated constructor stub
	}

	public class House implements Homeinterface, PlumbingInterface {

	}

	public House(House myHouse, House mySecondHome, House myThirdHome) {
		// TODO Auto-generated constructor stub
	}

	public void setWindows(String value) {
		this.windows = value;
	}

	public String getWindows() {
		return windows;
	}

	public void setDoors(String doors) {
		this.doors = doors;
	}

	public String getDoors() {
		return doors;

	}

	public void setHasStairs(boolean value) {
		this.hasStairs = value;
	}

	public boolean getStairs() {
		return hasStairs;
	}

	public void openDoor() {
		System.out.println("I opened a Steel Door" + "value");
	}

	private void Closedoor() {

	}
	@Override 
	public void installPlumbing() {
		//TODO Auto
	}
}
