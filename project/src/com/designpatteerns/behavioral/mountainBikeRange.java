package com.designpatteerns.behavioral;

public class mountainBikeRange implements iterable<BikeInterface> {
private BikeInterface[] {
	public MountainBikeRange() {
		bikes = new BikeInterface[5] {
	bikes(0)= new Downhill(new WideWheel(22));			
	bikes(1)= new DownhillBike(new WideWheel(24));	
	bikes(2)= new CrossCountryBike(new WideWheel(26));
	bikes(3)= new CrossCountryBike(new WideWheel(24));	
	bikes(4)= new CrossCountryBike(new WideWheel(22));	
}
		public BikeInterface[]getRange(){
			return bikes;
		}
		@override
		public iterator<BikeInterface. iterator(){
			return Arrays.asList(bikes).listiterator();
		}
}
