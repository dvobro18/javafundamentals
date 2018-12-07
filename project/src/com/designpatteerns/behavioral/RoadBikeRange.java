package com.designpatteerns.behavioral;

public class RoadBikeRange implements iterable<BikeInterface> {
private List<BikeInterface> bikes;
public RoadBikeRange() {
	bikes = new ArrayList<BikeInterface>();
	bikes.add(new TouringBike(new NarrowWheel(22)));
	bikes.add(new TouringBike(new NarrowWheel(24)));
	bikes.add(new TouringBike(new NarrowWheel(26)));
	bikes.add(new VintageBike(new NarrowWheel(24)));
	bikes.add(new VintageBike(new NarrowWheel(22)));
}
public List<BikeInterface> getRange(){
}
@Override
public Iterator<BikeInterface> iterator(){
	return bikes.Listiterator();
}
}
