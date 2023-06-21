package com.interfece;

public class Bike implements Vehicle,Sports {

	@Override
	public void activateHighSpeed() {
		System.out.println("High speed activated");
		
	}

	@Override
	public void brakes() {
		System.out.println("Applying brakes");
		
	}

	@Override
	public void changeGear() {
		System.out.println("Changed gear");
		
	}

}
