package Capgeminiday8;

import java.util.Scanner;

@FunctionalInterface
interface EvenorOdd{
	public String EorO(int a);
//	public void EE();
}
interface ConcateString{
	public String AddString(String a,String b);
}
interface A{
	public void StartswithA(String s[]);
}
public class Lamda {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String[] s1=new String[5];
		for(int i=0;i<5;i++)
			s1[i]=sc.next();
            EvenorOdd m=(a)->
            		{
            				if(a%2==0)
            					return "Even";
            				return "Odd";
            		};
            		System.out.println(m.EorO(11));
           ConcateString c=(a,b)->a.concat(b);
           System.out.println(c.AddString("rupak","niru"));
            A a=(s)->{
        	   for(String i:s)
        	   {
        		  if(i.charAt(0)=='A' || i.charAt(0)=='a')
        			  System.out.println(i);
        	   }
           };
           a.StartswithA(s1);
           System.out.println((int) 'a');
	}

}
