package com.qa.garage.vehicles;

public class Car extends Vehicle {

	private int bootSize;

	public Car(int noOfWheels, int bootSize) {
		super(noOfWheels);
		this.bootSize = bootSize;
	}

	public int getBootSize() {
		return this.bootSize;
	}

	public void setBootSize(int bootSize) {
		this.bootSize = bootSize;
	}

	@Override
	public String toString() {
		return "Car [bootSize=" + this.bootSize + ", getNoOfWheels()=" + this.getNoOfWheels() + "]";
	}

	@Override
	public float calcBill() {
		return this.getNoOfWheels() * 7 + 2 * this.bootSize;
	}

}
