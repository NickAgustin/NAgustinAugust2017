/*Nick Agustin
 * September 6th, 2017
 * Our self written math library! It contains a series of methods to do basic math functions!
 */

public class Calculate {
	
	//Square the input!
	public static int square(int operand) {
		return operand*operand;
	}
	
	//Cube the input!
	public static int cube(int operand) {
		return operand*operand*operand;
	}
	
	//Accepts two doubles and returns a double!
	public static double average(double operandOne, double operandTwo) {
		double average = (operandOne + operandTwo);
		return average/2;
	}
	
	//Accepts three doubles and returns a double!
	public static double average(double operandOne, double operandTwo, double operandThree) {
		double average = (operandOne + operandTwo + operandThree);
		return average/3;
	}
	
	//Accepts a Radian Double and returns a Degree double!
	public static double toDegrees(double operandRadian) {
		double toDegrees = (operandRadian*180);
		return toDegrees/3.14159;
	}
	
	//Accepts a Degree double and returns a Radian double!
	public static double toRadians(double operandDegree) {
		double toRadians = (operandDegree*3.14159);
		return toRadians/180;
	}
	
	//Provides the coefficients of a Quadratic Equation
	public static double discriminant(double operandA, double operandB, double operandC) {
		double discriminant = (operandB*operandB-4*operandA*operandC);
		return discriminant;
	}
	
	//Turn a Mixed Number into and an Improper Fraction
	public static int toImproperFrac(int operandA, double operandB, double operandC);
}