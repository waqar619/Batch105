package com.interfece;

public class InterfaceMain {

	public static void main(String[] args) {
		Car carObj = new Car();
		Bike bikeObj = new Bike();
		
		carObj.brakes();
		carObj.changeGear();
		bikeObj.brakes();
		bikeObj.changeGear();
		bikeObj.activateHighSpeed();

	}

}
