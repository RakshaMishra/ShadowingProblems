package com.kodnest.shadowingproblem;

import java.util.Scanner;

public class DemoStudentApp {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the details");
		 String name=sc.next();
		 int age=sc.nextInt();
		 int id=sc.nextInt();
		String  place=sc.next();
		 int marks=sc.nextInt();
		 long contact=sc.nextLong();
		 char ch=sc.next().charAt(0);
		 
		 Student s=new Student(name,age, id, place, marks, contact,ch);
		 
		 System.out.println("name----"+ s.name);
		 System.out.println("age----"+ s.age);
		 System.out.println("id----"+ s.id);
		 System.out.println("place----"+ s.place);
		 System.out.println("marks----"+ s.marks);
		 System.out.println("contact----"+ s.contact);
		 System.out.println("gender----"+ s.ch);
		 
		 

}
}
