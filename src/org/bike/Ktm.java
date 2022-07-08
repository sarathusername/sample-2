package org.bike;

public class Ktm implements Bike {
	@Override
	public void cost() {
		System.out.println("250000");
	}
	@Override
	public void speed() {
		System.out.println("200kph");		
	}

}
