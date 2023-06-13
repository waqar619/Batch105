package com.assignment.linkelist;

import java.util.LinkedList;
import java.util.List;

public class FruitsMain {

	public static void main(String[] args) {
		Fruits f1 = new Fruits("Mango",15);
		Fruits f2 = new Fruits("Apple",16);
		Fruits f3 = new Fruits("Orange",18);
		Fruits f4 = new Fruits("Papaya",15.2);
		Fruits f5 = new Fruits("Pineapple",16.7);
		Fruits f6 = new Fruits("Banana",19);
		Fruits f7 = new Fruits("Grape",20);
		Fruits f8 = new Fruits("Kiwi",12);
		Fruits f9 = new Fruits("Watermelon",11);
		Fruits f10 = new Fruits("Lemon",23);
		
		List<Fruits> listOfFruits = new LinkedList<Fruits>();
		
		listOfFruits.add(f1);
		listOfFruits.add(f2);
		listOfFruits.add(f3);
		listOfFruits.add(f4);
		listOfFruits.add(f5);
		listOfFruits.add(f6);
		listOfFruits.add(f7);
		listOfFruits.add(f8);
		listOfFruits.add(f9);
		listOfFruits.add(f10);
		System.out.println("Fruit_name "+ " Quantity");
		System.out.println();
		
		Fruits seventhFruit = listOfFruits.get(6);
		System.out.println("Seventh fruit: " + seventhFruit.getFruitName() + ", " + seventhFruit.getQuantity());
		
		System.out.println(listOfFruits.get(5));
		
		
		for(Fruits fruitsObj : listOfFruits) {
			
			//System.out.println(listOfFruits.get(4));
			
			System.out.println(fruitsObj.getFruitName()+"   "+fruitsObj.getQuantity());
		}
		

	}

}
