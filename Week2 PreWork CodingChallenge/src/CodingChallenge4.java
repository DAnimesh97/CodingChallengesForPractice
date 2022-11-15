import java.util.Scanner;

public class CodingChallenge4 {

 public static void main(String args[]) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a Year");
	 int number = sc.nextInt();
	 if (number%400==0) {
		 System.out.println("This is leap year");
	 }else if(number%100==0) { 
		 System.out.println("Not a Leap Year");
	 }
	 else if(number%4==0) {
		 System.out.println("This is leap year");
	 }
	 else {
		 System.out.println("Not a Leap Year");
	 }
	 
 
 
 
 }	 
 }
 	

