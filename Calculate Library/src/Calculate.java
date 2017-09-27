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
	
	//Provides the coefficients of a Quadratic Equation!
	public static double discriminant(double operandA, double operandB, double operandC) {
		double discriminant = (operandB*operandB-4*operandA*operandC);
		return discriminant;
	}
	
	//Turn a Mixed Number into an Improper Fraction!
	public static String toImproperFrac(int operandA, int operandB, int operandC) {
		int toImproperFrac = (operandA * operandC + operandB);
		int denominator = operandC;
		return toImproperFrac +"/" +denominator;
	}
	//Turn an Improper Fraction into a Mixed Number!
	public static String toMixedNum(int operandA, int operandB) {
		int numerator = (operandA%operandB);
		int toMixedNumTwo = operandA-numerator;
		int toMixedNum = toMixedNumTwo/operandB;
		int denominator = operandB;
		return toMixedNum +"_" +numerator +"/" +denominator;
	}
	//Multiplies two binomials! 
	public static String Foil(int operandA, int operandB, int operandC, int operandD, String operandL ) {
		String foilF = (operandA*operandC +operandL +"^2");
		String foilOI = (operandA*operandD+operandB*operandC +operandL);
		int foilL = (operandB*operandC);
		return foilF +"+" +foilOI +"+" +foilL;
	}
	//Checks if one integer is divisble another integer!
	public static boolean isDivisibleBy(int operandOne, int operandTwo) {
		int divisibleRemainder = (operandOne%operandTwo);
		if (divisibleRemainder==0) {
			System.out.println("The numbers are divisible!");
		}
		else if (divisibleRemainder!=0) {
			System.out.println("The numbers are not divisible!");
		}
		return false;
	}
	//Outputs the absolute value of the double that was input!
	public static double absValue(double operand) {
		if(operand>0) {
			double absValue = operand;
			return absValue;
		}
		else if (operand<0) {
			double absValue = operand*-1;
			return absValue;
		}
		else if (operand==0) {
			double absValue = 0;
			return absValue;
		}
	return operand;
	}
	//Compares two doubles and ouputs the higher number!
	public static double max(double operandOne, double operandTwo) {
		if(operandOne>operandTwo) {
			double max = operandOne;
			return max;
			}
		else if(operandOne<operandTwo) {
			double max = operandTwo;
			return max;
			}
		return operandTwo;
	}
	//Accepts three doubles and outputs the highest value!
	public static double max(double operandOne, double operandTwo, double operandThree) {
		if(operandOne>operandTwo) {
			return operandOne;
			}
		else if(operandOne<operandTwo) {
			return operandTwo;
			}
		if(operandOne>operandThree) {
			double max = operandOne;
			return max;
			}
		else if (operandOne<operandThree) {
			double max = operandThree;
			return max;
			}
		if(operandTwo>operandThree) {
			double max = operandTwo;
			return max;
			}
		else if(operandTwo<operandThree) {
			double max = operandThree;
			return max;
			}
		return operandThree;
	}
	//Accepts two doubles and ouputs the smaller value!
	public static double min(double operandOne, double operandTwo) {
		if(operandOne>operandTwo) {
			double min = operandTwo;
			return min;
			}
		else if(operandOne<operandTwo) {
			double min = operandOne;
			return min;
			}
		return operandTwo;
	}
	//This takes a double and rounds it to two decimal places!
	public static double round2(double operand) {
		double round2 = 0.0;
			int tempInt = (int) (operand*100);
			int roundNum = tempInt % 10;
			tempInt = tempInt / 10;
		if(roundNum >= 5 && tempInt > 0) {
				tempInt++;}
		else if (roundNum <= -5 && tempInt < 0);{
				tempInt--; }
				round2 = tempInt / 100.00;
		return round2;
	}
	//Raises a value to a positive integer power!
	public static double exponent(double operandOne, int operandTwo) {
		double x = 1;
		for (int i = 0; i<operandTwo; i++) {
			x = (x*operandOne);
			}
		return x;
	}
	//Returns the factorial of the value passed!
	public static int factorial(int operand) {
		int product = 1;
			System.out.println(product);
		for (int i = 0; i <= operand; i++) {
			product = product * i;
			}
		return product;
	}
	//Determines whether or not an integer is a prime!
	//COME BACK TO THIS!!!
	public static boolean isPrime(int operand) {
		if(operand < 2) return false;
		if(operand == 2) return true;
		if(operand % 2 == 0) return false;
		for(int i = 3; i * i <= operand;i += 2) {
			if(operand % i == 0) return false;
		}
		return true;
	}
	//Finds the greatest common factor of two integers!
	//COME BACK TO THIS!!!
	public static int gcf(int operandOne, int operandTwo) {
		while (operandOne != 0 && operandTwo != 0){
			if (operandOne >= operandTwo){
				operandOne= operandOne - operandTwo;
            }
            else operandTwo = operandTwo - operandOne;
            }
            if (operandOne == 0) return operandTwo;
            else return operandOne;
	}
	//Returns an approximation of the square root of the value passed, rounded to two decimal places!
	public static double sqrt(int operand) { 
		double squareRoot = operand / 2;
		double t = squareRoot;
			squareRoot = (t + (operand / t)) / 2;
		while ((t - squareRoot) != 0); 
		return squareRoot;
	}
	public static String quadForm(int operandA, int operandB, int operandC) {
		double root = (operandB * operandB - 4 * operandA * operandC);
			if(root<0) {
				System.out.println("There are no real roots!");
			}
			return null;
		}
}