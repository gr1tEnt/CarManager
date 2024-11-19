package com.gr1tent.java2;

public abstract class FarmCar implements Serviceable {

	String name;
	int yearOfProduction;
	int price;
	int weight;
	Color color;
	private int distance = 0;
	protected int distanceOnService = 0;
	
	public FarmCar(String name, int yearOfProduction, int price, int weight, Color color, int distance) {
		this.name = name;
		this.yearOfProduction = yearOfProduction;
		this.price = price;
		this.weight = weight;
		this.color = color;
		this.distance = distance;
	}
	
	protected abstract boolean isReadyToService();

	
	public void addDistance(int additinalDistance) {
		addDistanceToService(additinalDistance);
	}

	public void addDistance(float additinalDistance) {
		addDistanceToService(additinalDistance);
	}

	private void addDistanceToService(float additinalDistance) {
		distance += additinalDistance;
		distanceOnService += additinalDistance;
	}

	public void servise () {
		distanceOnService = 0;
		
	}
			
	
	public int getDistance() {
		return distance;
	}

	public int getDistanceOnService() {
		return distanceOnService;
	}

	public void setDistanceOnService(int distanceOnService) {
		this.distanceOnService = distanceOnService;
	}
	
	@Override
	public String toString() {
		return "FarmCar [name=" + name + ", yearOfProduction=" + yearOfProduction + ", price=" + price + ", weight="
				+ weight + ", color=" + color + ", distance=" + distance + "]";
	}

	
	
}
