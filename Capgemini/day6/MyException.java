package com.Capgemini.day6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MyException {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		try {
//			FileInputStream f = new FileInputStream("google.txt");
//			int n = 1 / 0;
			String s = null;
			System.out.println(s.substring(0, 5));
		} catch (ArithmeticException e) {
			System.err.println("AN Arithmetic exception occured");
		} catch (NullPointerException e) {
			System.err.println("String is null");
		} catch (Exception e) {
			System.err.println("Don't exactly know the Excetpion name");
		}
	}

}
