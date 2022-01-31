package rupak;

//import java.util.Arrays;
import java.util.*;

public class Candies {
	public static void main(String [] args)
    {
        Scanner sc=new Scanner (System.in);
        String s="The Dhillon theatre is an fun republic or a mall";
        String [] s1=s.split(" ");
        s=s.replaceAll("The" ,"");
        s=s.replaceAll("a", "");
        s=s.replaceAll("an", "");
        s=s.replaceAll("the", "");
        System.out.println(s);
//        String s3;
//        for(int i=0;i<s1.length;i++)
//        {
//        	char s2[]=s1[i].toCharArray();
//        	for(int j=0;j<s2.length;j++)
//        	{
//        		for(int k=j+1;k<s2.length;k++)
//        		{
////        			s3=s2.toString();
//        			s1[i]=s1[i].substring(j, k);
//        			if(s1[i].equalsIgnoreCase("the"))
//                		s1[i]="";
//                	if(s1[i].equalsIgnoreCase("a"))
//                		s1[i]="";
//                	if(s1[i].equalsIgnoreCase("an"))
//                		s1[i]="";
//                	
//                		
//        		}
//        	}
//        }
////        System.out.println(s);
//        for(int i=0;i<s1.length;i++)
//        {
//        	System.out.print(s1[i]+" ");
//        }
////        int a=Integer.parseInt(s);
////        System.out.println(a);
//        String s1,s2,s3;
//        int arr[]=new int[s.length()];
//        int max=0,len=0;
//        for(int i=0;i<s.length();i++)
//        {
//        	for(int j=i+1;j<s.length();j++)
//        	{
//        		s1=s.substring(i, j+1);
////        		System.out.println(s1);
//        		len=s1.length();
//        		if(len%2==0)
//        		{
////                    int arr[]=s1.toCharArray();
//        			int a=Integer.parseInt(s1);
//        		int	k=0;
//        			while(a!=0)
//        			{
////        				int dig=a%10;
//        				arr[k]=a%10;
//        				a/=10;
//        				k++;
//        			}
////        			for(int l=0;l<k;l++)
////        				System.out.print(arr[l]+" ");
////        			System.out.println();
//        			int sum=0;
//        			for(int l=0;l<k/2;l++)
//        			{
//        				sum=sum+arr[l];
//        			}
////        			System.out.println(sum);
//        		 int sum1=0;
//        			for(int l=k/2;l<k;l++)
//        			{
//        				sum1=sum1+arr[l];
//        			}
////        			System.out.println(sum1);
//        		  if(sum==sum1 && max<len)
//        		  {
//        			  max=len;
//        		  }
//        		}
//        	}
//        }
//        System.out.println(max);
          
//        for(int i=1;i<=n1;i++)
//        arr1[i]=i;
//        
//          for(int i=1;i<=n1;i++)
//          {
//        	  if(arr1[i]%2==0)
//        	  {
//        		  int temp=arr1[i];
//        		  for(int j=i;j<n1;j++)
//        		  {
//        			  arr1[j]=arr1[j+1];
//        		  }
//        		  arr1[n1]=temp;
//        	  }
//          }
//        
////        int [] arr=Arrays.copyOfRange(arr1, n1/2+1, n1+1);
////        Arrays.sort(arr);
//        for(int i=n1/2+1;i<=n1;i++)
//        {
//        	for(int j=n1/2+1;j<=n1;j++)
//        	{
//        		if(arr1[i]<arr1[j])
//        		{
//        			int temp=arr1[i];
//        			arr1[i]=arr1[j];
//        			arr1[j]=temp;
//        		}
//        	}
//        }
////        arr1=Arrays.copyOfRange(arr, 0, n1/2+1);
//        int sum=0;
//        for(int j=s;j<=n1;j++)
//        {
//        	System.out.print(arr1[j]+" ");
//        	sum=sum+arr1[j];
//        }
//        System.out.println(sum);
    }

}