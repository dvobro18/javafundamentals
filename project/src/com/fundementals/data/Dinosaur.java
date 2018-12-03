package com.fundementals.data;


public class Dinosaur {
	private String teeth;
	private String skin;
	
	
	
	public Dinosaur(String teeth, String skin) {
		this.teeth = teeth;
		this.skin = skin;
	}
	public void setTeeth1(String teeth) {
		this.teeth = teeth;
	}
	public String getTeeth() {
		return teeth;
	}
	public void setTeeth(String teeth) {
		this.teeth = teeth;
	}
	/**
	 * @return the teeth
	 */
public String getSkin() {
	return skin;
}
	
	public void move() {
		System.out.println("Most dinosaurs walk");
		
	}
}

