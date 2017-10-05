import java.util.Scanner;
public class CollaborativeProgrammingExcercise {
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("How many integers will you input?");
		int input = userInput.nextInt();
		System.out.println("Please input your integers!");
		int value = userInput.nextInt();
		int maxEven = 0;
		int sum = 0;
		int min = value;
		int max = value; 
		
		for(int i = 1; i < input; i++) {
			value = userInput.nextInt();
			if (value >= max) { 
				max = value;
			}
			else if (value < max) {
			}
			if (value <= min) {
				min = value;}
				else if(value > min) {
			}
			if(value % 2 == 0) {
					sum = value + sum;}
			if(value % 2 == 0) {
				if(value >= maxEven) {
					maxEven = value;}
				else if(value < maxEven){
					}	
				}	
			}
		System.out.println("This is you max: " + max);
		System.out.println("This is you min: " + min);
		System.out.println("This is the sum of the even numbers: " + sum);
		System.out.println("This is you max of the even numbers: " + maxEven);
		System.out.println("Thank You!");
	}
}
				
				