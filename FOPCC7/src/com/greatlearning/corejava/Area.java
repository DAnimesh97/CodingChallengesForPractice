package com.greatlearning.corejava;

public class Area {
     public float radius,result;
 	 final float pi=3.14F;

	public static void main(String[] args) {
		Area area =new Area();
	  area.radius=12.4F;
	  area.result=area.pi*area.radius*area.radius;
		
	  System.out.println("Area of the circle is "+ area.result);
	}
	
}
