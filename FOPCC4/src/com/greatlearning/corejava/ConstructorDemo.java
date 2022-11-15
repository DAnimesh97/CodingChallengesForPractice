package com.greatlearning.corejava;

public class ConstructorDemo {
   
	ConstructorDemo(){
		System.out.println("Hello Greatlearning!! \n I am Animesh Das \n I am 25 years old");
	}
	ConstructorDemo(int age,int weight){
		System.out.println("Age is "+age);
		System.out.println("Weight is "+weight);
	}
	
	
	public static void main(String[] args) {
	  ConstructorDemo s;
	  s = new ConstructorDemo();
	  s = new ConstructorDemo(25,84);
		
    
	}   
}
