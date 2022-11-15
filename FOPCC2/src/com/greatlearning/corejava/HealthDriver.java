package com.greatlearning.corejava;

public class HealthDriver {
 
	public static void main(String[] args) {
		 
		Health health =new Health();
		
		System.out.println("Patient Name is " + health.name);
		System.out.println("Patient Age is " + health.age + " "+ "Years");
		System.out.println("Patient Weight is " + health.weight);
		System.out.println("Patient BMI is " + health.bmi);
		
	}
}
