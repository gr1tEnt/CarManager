package com.gr1tent.java2;

public class Bus extends Car {


	public Bus(String name, int yearOfProduction, int price, int weight, Color color, int distanceOnService) {
		super(name, yearOfProduction, price, weight, color);
		this.distanceOnService = distanceOnService;
	}

	@Override
	public boolean isReadyToServise() {
		
		if (distanceOnService > 50000) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Bus{" +
				"name='" + name + '\'' +
				", yearOfProduction=" + yearOfProduction +
				", price=" + price +
				", weight=" + weight +
				", color=" + color +
				", distanceOnService=" + distanceOnService +
				'}';
	}
}
