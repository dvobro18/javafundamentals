package com.designpattterns.structural;
import com.designpatterns.base.BikeInterface;
public class WhiteTiresBike extends AbstractBikeOption {
public WhiteTiresBike(BikeInterface bike) {
	super(bike);
}
@Override
public float getPrice() {
	return decoratedBike.GetPrice() + 80.00F;
}
}
