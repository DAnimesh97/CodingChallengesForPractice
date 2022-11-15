package com.greatlearning.corejava;

public class ConstructorDemobyMe {
 ConstructorDemobyMe(){
	 System.out.println("I am the default constructor");
	}
 ConstructorDemobyMe(int age,float weight,String name,char A){
     System.out.println("I am Parameterized constructor. I take various arguments as input.");
     System.out.println("The age is: "+age);
     System.out.print("The weight is: "+weight);
     System.out.println("\n The name is: " +name);
     System.out.println("The character is: "+A);
 }
 public void observation() {
	 System.out.println("inside Observations method");
 }
 public static void main(String[] args) {
 ConstructorDemobyMe s=new ConstructorDemobyMe();
 ConstructorDemobyMe s1=new ConstructorDemobyMe(25,84.45F,"Animesh Das",'N');
 s.observation();
 }
}
