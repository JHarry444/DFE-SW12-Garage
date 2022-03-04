package com.qa.garage.vehicles;

import com.qa.garage.Billable;

public abstract class Vehicle implements Billable {

	private int id;

	private int noOfWheels;

	public Vehicle(int noOfWheels) {
		super();
		this.setNoOfWheels(noOfWheels);
	}

	// EVERY Vehicle can calc a bill

	public int getNoOfWheels() {
		return this.noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		if (noOfWheels >= 0)
			this.noOfWheels = noOfWheels;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
