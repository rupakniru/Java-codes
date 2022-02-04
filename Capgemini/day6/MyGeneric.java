package com.Capgemini.day6;
class Address<f>{
	private f name;

	public String toString() {
		return "Address [name=" + name + "]";
	}

	public Address(f name) {
		super();
		this.name = name;
		
	}


	
}
public class MyGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Address<Integer> e=new Address<Integer>(1);
            System.out.println(e);
            Address<String> e1=new Address<String>("Rupak");
            
	}

}
