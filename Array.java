package rupak;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int arr[]=new int[n+1];
//        int n1=sc.nextInt();
//        for(int i=0;i<n;i++)
//        {
//        	arr[i]=sc.nextInt();
//        }
//        for(int i=0;i<6;i++)
//        {
//        	if(arr[i]==n1)
//        	{
//        		for(int j=i;j<n-1;j++)
//        		{
//        			arr[j+1]=arr[j];
//        		}
//        	}
//        }
//        for(int i=0;i<n-1;i++)
//        {
//        	System.out.print(arr[i]+" ");
//        }
//        
//        List<Integer> li=new ArrayList<>();
//        for(int i=0;i<5;i++)
//        {
//        	li.add(sc.nextInt());
//        }
//        int n1=sc.nextInt();
//        li.remove(n1);
//        for(int i : li)
//        	System.out.print(i+" ");
        String s=sc.nextLine();
        String [] s1=s.split(" ");
        String s2;
        for(int i=0;i<s1.length;i++)
        {
             s2="";
//        	System.out.println(i);
        	for(int j=s1[i].length()-1;j>=0;j--)
        	{             //0      
        		s2=s2+s1[i].charAt(j);
        	}
        	if(s1[i].length()!=1 && s2.equalsIgnoreCase(s1[i]))
        	{
        		System.out.println(s1[i]);
        	}
        }
//        System.out.println(s2);
          	
}
}
//1 2 3 4 5
//0 1 2 3 4    4 5
//A
//0,0 0,1 0,2
//1,0 1,1 1,2
//2,0 2,1 2,2
//int main() {
//	   int arr[30], num, i, loc;
//	 
//	   printf("\nEnter no of elements :");
//	   scanf("%d", &num);
//	 
//	   //Read elements in an array
//	   printf("\nEnter %d elements :", num);
//	   for (i = 0; i < num; i++) {
//	      scanf("%d", &arr[i]);
//	   }
//	 
//	   //Read the location
//	   printf("\n location of the element to be deleted :");
//	   scanf("%d", &loc);
//	 
//	   /* loop for the deletion  */
//	   while (loc < num) {
//	      arr[loc] = arr[loc+1];
//               3   -1         3
//                 2
//               4   -1         4
//                  3
//	      loc++;
//	   }
//	   num--;  // No of elements reduced by 1
//	 
//	   //Print Array
//	   for (i = 0; i < num; i++)
//	      printf("\n %d", arr[i]);
//	 
//	   return (0);
//	}