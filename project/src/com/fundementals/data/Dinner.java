package com.fundementals.data;

public enum Dinner {
Turkey, Stuffing, Cranberry, SweetPotatoes, MacCheese,
DinnerRolls, Ham, GreenBeenCasrole, GreenRice, MashedPotatoes,
CornBread, DeviledEggs, PumkinPie, AppleCobler, PumpkinPie;
	
	private Dinner() {
		System.out.println("Constructor called for "+this.toString());
		
	}
	public void readyNow() {
		System.out.println("Let's eat already.");
	}
}
