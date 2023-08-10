import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Please enter a number");
	
	int number = scanner.nextInt();
	int addition = 0;
	do { 
		
		addition += number % 10;
		number = number / 10;
	}while(number > 0);
	
	System.out.println("Sum of digits of the entered number: " + addition);
	
	
	

	}

}
