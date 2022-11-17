package com.greatlearning.corejava;

public class StaticFinalDemo {
  
	int var1=10;
	static int var2=10;
	//final int var2=10;  
	/*Conclution with "final" access modifier: It's throwing and error due to we cant 
	change value when it is declared as a constant*/
	public void method1() {
		var1++;
		System.out.println(var1);
	}
    public void method2() {
    	var2++;
    	System.out.println(var2);
    }
   
    public static void main(String[] args) {
		   
    	StaticFinalDemo obj1 = new StaticFinalDemo();
    	StaticFinalDemo obj2 = new StaticFinalDemo();
    	StaticFinalDemo obj3 = new StaticFinalDemo();
	
    //method1
    obj1.method1();
    obj2.method1();
    obj3.method1();
    //method2
    obj1.method2();
    obj2.method2();
    obj3.method2();
    
    
    }
}
 

