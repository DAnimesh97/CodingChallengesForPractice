package com.greatlearning.corejava;

public class CustomerDriver {
 public static void main(String[] args) {
	Customer customer1 = new Customer();
	 customer1.setName("Animesh Das");
 System.out.println(customer1.getName());
 System.out.println("Age = " +customer1.age);
 System.out.println("Weight = " +customer1.weight);
}
}
