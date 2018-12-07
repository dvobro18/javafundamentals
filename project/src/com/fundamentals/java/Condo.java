package com.fundamentals.java;

import com.fundamentals.java.House1.House;

public class Condo extends House{
	private boolean hasBalcony;
	public Condo(String value) {
		System.out.println("My Condo Constructor" +value);
	}
	public Condo() {
		System.out.println("My Condo Constructor");
	}
	public void setHasBalcony(boolean hasBalcony) {
		this.hasBalcony = hasBalcony;
		
	}
	public boolean getHasBalcony() {
		return hasBalcony;
	}
	@Override
	public Object openDoor() {
		super.openDoor():
		System.out.println(" I opened a wooden door" +value);
	}
	@Override
	public void decorate() {
		//TODO Auto-generated method stub
		System.out.println("Decorate Condo");
	}
	public void setDoors(String string) {
		// TODO Auto-generated method stub
		
	}
	public char[] getDoors() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setDoors(String string) {
		// TODO Auto-generated method stub
		
	}
}
