package com.designpattterns.structural;
import com.designpatterns.base.Wheel;
public class UltraWheelAdapter extends Wheel {
public UltraWheelAdapter(UltraWheel ultraWheel) {
	super(ultraWheel.getWheelSize(),false);
}
}
