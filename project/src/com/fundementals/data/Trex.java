package com.fundementals.data;

public class Trex extends Dinosaur {
	public Trex(String teeth, String skin) {
		super(teeth, skin);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void move() {
		System.out.println("All TRexs run");
	}
	public void devourPrey() {
		System.out.println("TRex devours its prey");
	}

}
