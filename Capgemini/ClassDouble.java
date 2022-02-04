package com.Capgemini;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Exception1 {
	public static void not() throws Exception {
		FileInputStream f = new FileInputStream("google.txt");
		System.out.println("hello");
	}
}

public class ClassDouble {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stu=2b
//           Scanner sc=new Scanner(System.in);
//           Double d=new Double(sc.nextDouble());
//	   
//        	String s=d.toString();
//        	s=s+s;
//        	System.out.println(s);
//           short sh= d.shortValue(); 
//        		 System.out.println(sh);

		try {
			Exception1.not();
		} catch (FileNotFoundException e) {
				
		}

	}

}
