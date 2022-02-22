package com.qa.garage;

import java.util.ArrayList;
import java.util.List;

// interface
public class Garage implements Billable {

	private List<Vehicle> vehicles = new ArrayList<>();

	private int count = 0;

	public void addVehicle(Vehicle v) {
		this.vehicles.add(v);
		v.setId(++count);
	}

	@Override
	public float calcBill() {
		float bill = 0;
		for (Vehicle v : this.vehicles)
			bill += v.calcBill();
		return bill;
	}

	public float calcBillSimple() {
		float bill = 0;

		for (Vehicle v : this.vehicles) {
			if (v instanceof Car) {
				bill += (v.getNoOfWheels() * 7);
			} else if (v instanceof Bike) {
				bill += (v.getNoOfWheels() / 4);
			} else if (v instanceof Plane) {
				bill += (v.getNoOfWheels() * v.getNoOfWheels());
			}
		}
		return bill;
	}

	public void removeById(int id) {
		for (Vehicle v : this.vehicles) {
//		for (int i = 0; i < this.vehicles.size(); i++) {
//			Vehicle v = this.vehicles.get(i);
			if (v.getId() == id) {
				this.vehicles.remove(v);
				return;
			}
		}
	}

	public void removeByType(Class<?> type) {
		List<Vehicle> toRemove = new ArrayList<>();

		for (Vehicle v : this.vehicles) {
			if (v.getClass() == type)
				toRemove.add(v);
		}

		this.vehicles.removeAll(toRemove);
	}

	public void removeByType(String type) {
		List<Vehicle> toRemove = new ArrayList<>();

		for (int i = 0; i < this.vehicles.size(); i++) {
			Vehicle v = this.vehicles.get(i);
			String vehicleType = v.getClass().getSimpleName();
			if (vehicleType.equalsIgnoreCase(type))
				toRemove.add(v);
		}

		this.vehicles.removeAll(toRemove);
	}

	public void empty() {
		this.vehicles.clear();
	}

	public void print() {
		System.out.println(this.vehicles);
	}
}
