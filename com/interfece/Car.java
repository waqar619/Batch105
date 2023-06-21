package com.interfece;

public class Car implements Vehicle {


	@Override
	public void brakes() {
		System.out.println("brakes applied");
		
	}

	@Override
	public void changeGear() {
		System.out.println("Gear changed");
		
	}

}
