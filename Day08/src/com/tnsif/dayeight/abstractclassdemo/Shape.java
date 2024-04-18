package com.tnsif.dayeight.abstractclassdemo;



//abstract class
public abstract class Shape {
	
	protected float area;  
	
	//abstratc method
	public abstract void calArea();
	
	//concrete method / solid
	public void show()
	{
		System.out.println("Area of shape is :" + area);
	}
	

}
