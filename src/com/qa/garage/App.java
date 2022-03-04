package com.qa.garage;

import com.qa.garage.vehicles.Bike;
import com.qa.garage.vehicles.Car;
import com.qa.garage.vehicles.Lorry;
import com.qa.garage.vehicles.Plane;

public class App {

	public static void main(String[] args) {
		// ctrl + space -> auto-complete
		Garage garry = new Garage();

		garry.addVehicle(new Car(3, 10));
		garry.addVehicle(new Car(4, 22));
		garry.addVehicle(new Bike(4, true));
		garry.addVehicle(new Plane(3, true));
		garry.addVehicle(new Lorry(12, true));

//		garry.print();

		System.out.println(garry.calcBill());
//		garry.removeById(1);

		garry.removeByType(Car.class);

		garry.print();

		System.out.println(garry.calcBill());
	}

}
