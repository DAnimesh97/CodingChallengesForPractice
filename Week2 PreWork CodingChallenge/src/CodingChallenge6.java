import java.util.Scanner;

public class CodingChallenge6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number between 1 to 3");
		int number = sc.nextInt();
		switch(number) {
		case 1:System.out.println("neither prime nor composite");break;
		case 2:System.out.println("no is prime");break;
		case 3:System.out.println("no is composite");break;
		default:System.out.println("Wrong input number");break;
		}
	}
}
