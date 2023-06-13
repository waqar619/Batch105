package com.assignment.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapMain {

	public static void main(String[] args) {
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
		
		employeeMap.put(36235, "Suresh");
		employeeMap.put(36255, "Akhil");
		employeeMap.put(36256, "Samuel");
		employeeMap.put(36257, "Nikhil");
		employeeMap.put(36258, "Diksha");
		
		System.out.println("Size of the employee is: "+ employeeMap.size() );
		
		employeeMap.put(36258, "Komal");
		
		System.out.println("Size of the employee after update is: "+ employeeMap.size() );
		
		for(Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			
			System.out.println(key+" "+val);
			
		}
		
		System.out.println();
		//System.out.println();
		
		boolean found = false;
		for(Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			if(val.equals("Akhil")) {
				System.out.println(key+" "+val);
				found =true;
				break;
			}
				
			}
		 if(found==false) {
				System.out.println("Not found");
		
		
		
		

	}
	}
}


