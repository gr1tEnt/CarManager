package com.gr1tent.java2;

import java.util.ArrayList;
import java.util.List;

public class CarManager {

	public static void main(String[] args) {

		Car prius = new PassengerCar("Toyota Prius", 2008, 15000, 1200, Color.GREEN, 92384);

		Car laguna = new Bus("Ranault Laguna", 2000, 9600, 1600, Color.WHITE, 51000);
		
		Motorcycle suzuki = new Motorcycle("Suzuki GSX-R1000", 2021, 16000, 700, Color.BLACK, "diesel", true, 210000);
		
		Motorcycle yamaha = new Motorcycle("Yamaha  FZ1", 2007, 9000, 700, Color.BLACK , "gas", false, 0);


		List<Motorcycle> moto = new ArrayList<>();
		moto.add(suzuki);
		moto.add(yamaha);

		System.out.println(moto);

/*		prius.addDistance(15000);
		laguna.addDistance(15000);

		System.out.println(prius.isReadyToServise());
		System.out.println(laguna.isReadyToServise());


		
		suzuki.destroyEngine();
		yamaha.destroyEngine();

		System.out.println(suzuki);
		System.out.println(yamaha);

		suzuki.repair();
		yamaha.repair();

		yamaha.setColor(Color.BLACK);


		suzuki.addDistance(8100);
		yamaha.addDistance(7000);
*/

/*		System.out.println(suzuki.isReadyToService());
		System.out.println(yamaha.isReadyToService());

		System.out.println(suzuki);
		System.out.println(yamaha);
*/


//		System.out.println(prius.equals(laguna));
//		System.out.println(prius.equals(prius2));

		
	}

}
