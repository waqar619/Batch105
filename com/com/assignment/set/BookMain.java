package com.com.assignment.set;

import java.util.HashSet;
import java.util.Set;

public class BookMain {

	public static void main(String[] args) {
		Book b1 = new Book("Adventures of Tom Sawyer","Mark Twain",101);  
		Book b2 = new Book("Agni Veena","Kazi Nasrul Islam",102);
		Book b3 = new Book("Animal Farm","George Orwell",103);
		Book b4 = new Book("Ben Hur","Lewis Wallace",104);
		Book b5 = new Book("Mein Kampf","Adolf Hitler",105);
		Book b6 = new Book("Time Machine","H.G. Wells",106);
		Book b7 = new Book("A passage to India","E.M.Forster",107);
		Book b8 = new Book("Mein Kampf","Adolf Hitler",105);
		Book b9 = new Book("Mein Kampf","Adolf Hitler",105);
		Book b10 = new Book("Geetanjali","Rabindra Nath Tagore",108);
		Book b11 = new Book("Chitra","R.N.Tagore",109);
		Book b12= new Book("Bisarjan","R.N.Tagore",110);
		Book b13= new Book("Ben Hur","Lewis Wallace",104);
		Book b14 = new Book("Ben Hur","Lewis Wallace",104);
		Book b15= new Book("Around the World in eighty days","Jules Verne",110);
		Book b16= new Book("Anna Karenina","Leo Tolstoy",111);
		Book b17= new Book("Adventures of Tom Sawyer","Mark Twain",101);
		Book b18= new Book("Adventures of Tom Sawyer","Mark Twain",101);
		Book b19= new Book("Pride and Prejudice","Jane Austen",112);
		Book b20= new Book("Pride and Prejudice","Jane Austen",112);
		
		Set<Book> bookList = new HashSet<Book>();
		
		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b3);
		bookList.add(b4);
		bookList.add(b5);
		bookList.add(b6);
		bookList.add(b7);
		bookList.add(b8);
		bookList.add(b9);
		bookList.add(b10);
		bookList.add(b11);
		bookList.add(b12);
		bookList.add(b13);
		bookList.add(b14);
		bookList.add(b15);
		bookList.add(b16);
		bookList.add(b17);
		bookList.add(b18);
		bookList.add(b19);
		bookList.add(b20);
		
		
		
		boolean found = false;
		
		for(Book bookObj : bookList) {
			if (bookObj.getAuthor().equals("George Orwell")) {
				System.out.println(bookObj.getBookName()+ " "+ bookObj.getAuthor()+ " "+ bookObj.getBookId());
				found =true;
				break;
			
			}
			
				
			
		}
		 if(found==false) {
			System.out.println("Not found");
		}
		 
		//System.out.println(bookObj.getBookName()+ " "+ bookObj.getAuthor()+ " "+ bookObj.getBookId());
		
		
		

	}

}
