package com.gr1tent.java2;

public class PassengerCar extends Car {

	public PassengerCar(String name, int yearOfProduction, int price, int weight, Color color, int distance) {
		super(name, yearOfProduction, price, weight, color);
		
	}

	@Override
	public boolean isReadyToServise() {
		
			if (distanceOnService > 10000) {
				return true;
			} 
			return false;
	}

	
}
