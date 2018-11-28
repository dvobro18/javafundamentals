package com.fundementals.data;

public enum Dinner {

	
	private Dinner() {
		System.out.println("Constructor called for "+this.toString());
		
	}
	public void readyNow() {
		System.out.println("Let's eat already.");
	}
}
