package com.gr1tent.java2;

import java.util.Objects;

public class Motorcycle {

	String name;
	int yearOfProduction;
	int price;
	int weight;
	Color color;
	String engineType;
	boolean isReadyToDrive;
	int distance;
	protected int distanceOnServise = 0;

	public Motorcycle(String name, int yearOfProduction, int price, int weight, Color color, String engineType,
			boolean isReadyToDrive, int distance) {
		this.name = name;
		this.yearOfProduction = yearOfProduction;
		this.price = price;
		this.weight = weight;
		this.color = color;
		this.engineType = engineType;
		this.isReadyToDrive = isReadyToDrive;
		this.distance = distance;
	}

	public boolean destroyEngine() {

		if (distance > 200000) {
			isReadyToDrive = false;
		} else {
			isReadyToDrive = true;
		}

		return false;
	}

	public void repair() {
		isReadyToDrive = true;

	}

	public void setColor(Color color) {
		this.color = color;

	}

	public void addDistance(int additinalDistance) {
		addDistanceToService(additinalDistance);

	}

	public void addDistance(float additinalDistance) {
		addDistanceToService(additinalDistance);
	}
		
	private void addDistanceToService(float additinalDistance) {
		distance += additinalDistance;
		distanceOnServise += additinalDistance;
	}
	
	
	public boolean isReadyToService () {
		if (distanceOnServise > 8000) {
			return true;
		}
		return false;
	}

	public int getDistance() {
		return distance;

	}

	@Override
	public String toString() {
		return "Motorcycle [name=" + name + ", yearOfProduction=" + yearOfProduction + ", price=" + price + ", weight="
				+ weight + ", color=" + color + ", engineType=" + engineType + ", isReadyToDrive=" + isReadyToDrive
				+ ", distance=" + distance + ", distanceOnServise=" + distanceOnServise + "]";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Motorcycle that = (Motorcycle) o;
		return weight == that.weight && color == that.color;
	}

	@Override
	public int hashCode() {
		return Objects.hash(weight, color);
	}
}
