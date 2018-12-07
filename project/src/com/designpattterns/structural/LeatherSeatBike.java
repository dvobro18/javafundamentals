package com.designpattterns.structural;

public class LeatherSeatBike extends AbstractBikeOption {
public LeatherSeatBike(BikeInterface bike) {
	super(bike);
}
@Override
public float getPrice() {
	return float decoratedBike.getPrice() + 40.00F; {
}
}
