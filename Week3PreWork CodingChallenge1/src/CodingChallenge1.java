import java.util.Scanner;

public class CodingChallenge1 {

	public static void main(String[] args) {
		//declare variables and assign values
		int num=1;
		//declare variables and assign values
		int num1;
		float num2;
		double num3;
		char character;
		boolean bool;
		String str;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a integer number");
		num1=sc.nextInt();
		
		System.out.println("enter a float value");
		num2=sc.nextFloat();
		
		System.out.println("enter a double value");
		num3=sc.nextDouble();
		
		System.out.println("enter a character value");
		character=sc.next().charAt(0);
		
		System.out.println("enter a boolean value");
		bool=sc.nextBoolean();
		
		System.out.println("enter a string value");
		str=sc.nextLine();
		
		System.out.println("int -> " + num1);
		System.out.println("float -> " + num2);
		System.out.println("char -> " + character);
		System.out.println("boolean -> " + bool);
		System.out.println("String -> " + str);
		System.out.println("double -> " + num3);
	}
}
