package com.fundamentals.java;

class House1 {
	private String windows;
	String doors;
	private boolean hasStairs;
	public int length;

	House1() {
		// TODO Auto-generated constructor stub
	}

	public class House implements Homeinterface, PlumbingInterface {

		public char[] doors;
		public int length;

		public House(House myHouse, House mySecondHome, House myThirdHome) {
			// TODO Auto-generated constructor stub
		}

		public House() {
			// TODO Auto-generated constructor stub
		}

		@Override
		public void supplementWork() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void installPlumbing() {
			// TODO Auto-generated method stub
			
		}

		public Object openDoor() {
			// TODO Auto-generated method stub
			return null;
		}

		public void setDoors(String string) {
			// TODO Auto-generated method stub
			
		}

		public char[] getDoors() {
			// TODO Auto-generated method stub
			return null;
		}

		public void decorate() {
			// TODO Auto-generated method stub
			
		}

	}
	/*Default Constructor with a println*/
	public void House() {
		System.out.println("My default constructor");
	}
	public House1(String windows) {
		this. windows = windows;
	}
	public House1(String windows, String doors) {
		this.windows = windows;
		this.doors = doors;
	}
	public void Condo(String value) {
		System.out.println("My Condo Constructor"+value);
	}
	

	public House1(House1 myHouse, House1 mySecondHome, House1 myThirdHome) {
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
	
	public void installPlumbing() {
		//TODO Auto
	}
	public void supplementWork() {
		// TODO Auto-generated method stub
		
	}
	public void decorate() {
		// TODO Auto-generated method stub
		
	}
	public boolean getwindows() {
		// TODO Auto-generated method stub
		return false;
	}
}
