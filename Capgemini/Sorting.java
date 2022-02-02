//package capgeminiRupak.com;
package com.Capgemini;

import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
     	   arr[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
        	for(int j=i+1;j<n;j++)
        	{
        		if(arr[i]>arr[j])
        		{
//        			System.out.println(arr[i]);
        			int temp=arr[i];
        			arr[i]=arr[j];
        			arr[j]=temp;
        			
        		}
        	}
        }
        for(int i=0;i<n;i++)
        	System.out.print(arr[i]+" ");
	}

}
