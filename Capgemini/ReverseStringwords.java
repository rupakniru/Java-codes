package com.Capgemini;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseStringwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String s1[] = s.split(" ");
		for (int i = 0; i < s1.length; i++) {
			StringBuffer s2 = new StringBuffer(s1[i]).reverse();
			s1[i] = s2.toString();
		}
		for (String s3 : s1)
			System.out.print(s3 + " ");
		System.out.println();
		System.out.println(s1.length);
		Character c = sc.next().charAt(0);
		String s4 = c.toString();
		s = s.replace(s4, "");
		System.out.println(s.trim());
		int arr[] = new int[256];
		for (int i = 0; i < s.length(); i++) {
			arr[s.charAt(i) - 97]++;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0)
				System.out.println((char) (i + 97) + " -->" + arr[i]);
		}
		System.out.println("-----------------------------------");
		String s5 = sc.next();
		char[] c1 = s.toCharArray();
		char[] c2 = s5.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		for(int i=0;i<s.length();i++)
		{
			if(c1[i]!=c2[i])
			{
				
			}
		}
	}

}
