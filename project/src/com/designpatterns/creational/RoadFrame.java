package com.designpatterns.creational;

import com.designpatterns.creational.BikeFrameInterface;

public class RoadFrame implements BikeFrameInterface {

	@Override
	public String getFrameParts() {
		return "Frame parts for the Road Bike";
	}
}
