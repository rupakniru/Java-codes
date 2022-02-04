package com.Capgemini;

import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc=new Scanner(System.in);
           String s=sc.nextLine();
           String s1=sc.nextLine();
           s=s.concat(s1);
           s1=s.substring(0, s.length()-s1.length());
           s=s.substring( s1.length());
           System.out.println("s is "+ s +" s1 is" +s1);
	}

}
