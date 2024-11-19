package com.gr1tent.java2;

public interface Serviceable {

	boolean isReadyToServise ();

	int getDistance();
	
	void servise ();

	void addDistance(float additinalDistance);

	int getDistanceOnService();

	void setDistanceOnService(int distanceOnService);

	
}
