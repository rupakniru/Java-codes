package com.Capgemini;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//cap
           Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           int arr[]=new int[n];
           for(int i=0;i<n;i++)
        	   arr[i]=sc.nextInt();
           boolean visited[]=new boolean[n];
           Arrays.fill(visited, false);
           for(int i=0;i<n;i++)
           {
        	   for(int j=i+1;j<n;j++)
        	   {
        		   if(arr[i]==arr[j] && visited[i]==false)
        		   {
        			     visited[j]=true;
                         System.out.println(arr[i]);
                         break;
        		   }
        	   }
           }
           
	}

}
