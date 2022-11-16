package com.greatlearning.corejava;

public class ThreeDimensionShape {
    double width;
    double height;
    double depth;
    
   ThreeDimensionShape() {
		height=width=depth=0;
	}
   ThreeDimensionShape(double length) {
		height=depth=width=length;
  	}
   ThreeDimensionShape(double w,double h,double d) {
		height=h;
		width=w;
		depth=d;
  	}
    double volume() {
	   return width*height*depth;
   }
    public static void main(String[] args) {
		  
    double volume; 
		 ThreeDimensionShape shape1=new ThreeDimensionShape();
		 ThreeDimensionShape shape2=new ThreeDimensionShape(5.2);
		 ThreeDimensionShape shape3=new ThreeDimensionShape(4,5,6.2);
	//get volume of the first box
		 volume=shape1.volume();
		 System.out.println("Volume of the Shape1 "+volume);
	//get volume of the second box	
		 volume=shape2.volume();
		 System.out.println("Volume of the Shape2 "+volume);
	//get volume of the third box	 
		 volume=shape3.volume();
		 System.out.println("Volume of the Shape3 "+volume);
    }
}
