package com.qa.garage.vehicles;

public class Plane extends Vehicle {

	private boolean propellor;

	public Plane(int noOfWheels, boolean propellor) {
		super(noOfWheels);
		this.propellor = propellor;
	}

	public boolean isPropellor() {
		return this.propellor;
	}

	public void setPropellor(boolean propellor) {
		this.propellor = propellor;
	}

	@Override
	public String toString() {
		return "Plane [propellor=" + this.propellor + ", getNoOfWheels()=" + this.getNoOfWheels() + "]";
	}

	@Override
	public float calcBill() {
		float bill = 0;

		bill += this.getNoOfWheels() * this.getNoOfWheels();
		if (this.propellor)
			bill += 25;
		return bill;
	};

}
