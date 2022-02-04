package com.Capgemini.day6;

import com.Capgemini.day6.outer.inner;
interface B{
	int n=10;
	public void print();
	public void print1();
}
class outer{
	public void print()
	{
		System.out.println("Hello");
	}
	static class inner{
		public void print()
		{
			System.out.println("Hi");
		}
	}
}
public class Classes {
int a=23;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          outer o=new outer();
          a+=a;
          o.print();
          outer.inner i=new outer.inner();
          i.print();
          B b=new B() {
        	  public void print()
        	  {
        		  System.out.println(n);
        	  }
        	  public void print1()
        	  {
        		  
        	  }
          };
          b.print();
	}

}
