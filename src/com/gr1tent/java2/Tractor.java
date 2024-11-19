package com.gr1tent.java2;

public class Tractor extends FarmCar {

	public Tractor(String name, int yearOfProduction, int price, int weight, Color color, int distance) {
		super(name, yearOfProduction, price, weight, color, distance);

	}

	@Override
	public boolean isReadyToServise() {
		
		if (distanceOnService > 50000) {
			return true;
		} 
		return false;	}

	@Override
	protected boolean isReadyToService() {
		// TODO Auto-generated method stub
		return false;
	}

	
}

