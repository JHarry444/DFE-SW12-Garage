package com.qa.garage;

public class Bike extends Vehicle {

	private boolean sideCar;

	public Bike(int noOfWheels, boolean sideCar) {
		super(noOfWheels);
		this.sideCar = sideCar;
	}

	public boolean isSideCar() {
		return this.sideCar;
	}

	public void setSideCar(boolean sideCar) {
		this.sideCar = sideCar;
	}

	@Override
	public String toString() {
		return "Bike [sideCar=" + this.sideCar + ", noOfWheels=" + this.getNoOfWheels() + "]";
	}

	@Override
	public float calcBill() {
		float bill = 0;
		bill += this.getNoOfWheels() / 4;
		if (this.isSideCar())
			bill += 30;
		return bill;
	}

}
