package com.assignment.arraylist;

import java.util.ArrayList;
import java.util.List;

public class StudentRunner {

	public static void main(String[] args) {
		Student st1 = new Student(201, "Punit");
		Student st2 = new Student(202, "Aadil");
		Student st3 = new Student(203, "Imad");
		Student st4 = new Student(204, "Saqlain");
		Student st5 = new Student(205, "Raashid");
		
		List<Student> newlist = new ArrayList<Student>();
		
		newlist.add(st1);
		newlist.add(st2);
		newlist.add(st3);
		newlist.add(st4);
		newlist.add(st5);
		
		System.out.println("Student_id "+ "Student name");
	
		
		
		for(Student studentObj : newlist) {
			System.out.println(studentObj.getStudentId()+"    " + studentObj.getStudentName());
		}

	}

}
