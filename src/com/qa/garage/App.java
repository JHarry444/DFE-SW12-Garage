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
		final int id = 5;

		garry.findById(id).ifPresentOrElse(System.out::println,
				() -> System.out.println("No vehicle found with id " + id + "!"));

//		opt.ifPresent(v -> System.out.println(v));
//		Vehicle found = opt.orElse(new Bike(6, true));
//		System.out.println(found);
	}

}
