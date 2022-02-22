package com.qa.garage;

public class Lorry extends Vehicle {

	private boolean refrigerated;

	public Lorry(int noOfWheels, boolean refrigerated) {
		super(noOfWheels);
		this.refrigerated = refrigerated;
	}

	@Override
	public float calcBill() {
		float bill = 0;
		bill += this.getNoOfWheels() * 10;
		if (this.refrigerated)
			bill += 30;
		return bill;
	}

}
