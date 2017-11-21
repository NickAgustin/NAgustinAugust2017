package fracCalc;
import java.util.*;
import java.util.Scanner;
public class FracCalc {

	public static void main (String[] args){
		System.out.println("Insert Your Equation");
		Scanner input  = new Scanner(System.in);
		String userInput = input.nextLine();
		 while (userInput.equals("quit")!= true){
			String answer = produceAnswer(userInput);
			System.out.println(answer);
			userInput = input.nextLine();
		}
		System.out.println("Thank You!");
	}
        // TODO: Read the input from the user and call produceAnswer with an equation
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input){
    	String answer = "";
    	String[] array1 = input.split(" ");
    	String operand1 = array1[0];
    	String operator = array1[1];
    	String operand2 = array1[2];
    	String operandFirst[] = splitOperand(operand1);
    	String operandSecond[] = splitOperand(operand2);
    	if(operator.equals("+")) {
    		answer = toMixedNum(addition(operandFirst, operandSecond));
    	}
    		else if(operator.equals("-")){
    			answer = toMixedNum(subtraction(operandFirst, operandSecond));
    		}
    		else if(operator.equals("*")) {
    			answer = toMixedNum(multiplication(operandFirst, operandSecond));
    		}
    	
    		else if(operator.equals("/")) {
    			answer = toMixedNum(division(operandFirst, operandSecond));
    		}
    	return answer;
    }
    
public static String toMixedNum(int[] answer) {
		String reducedAnswer;
		int GCF = gcf(answer[0],answer[1]);
		if(GCF!=1) {
			answer[0] = answer[0]/GCF;	// Numerator
			answer[1] = answer[1]/GCF;	// Denominator
		}
		if(answer[1]<0){
			answer[1]=Math.abs(answer[1]);
			answer[0]=answer[0]*-1;
		}
		int coefficient = answer[0] / answer[1];
	  	int remainder = answer[0] % answer[1];
	 	if (coefficient < 0){
	  		if(remainder==0 && answer[1]==1){
	  			reducedAnswer = (Integer.toString(coefficient));
	 		}else if(remainder == 0 && answer[1] == -1){
	 			reducedAnswer = (Integer.toString(coefficient));
	  		}else{
		  		 reducedAnswer = coefficient + "_" + Math.abs(remainder) + "/" + Math.abs(answer[1]);
			}
		}else if(remainder == 0){
			reducedAnswer = coefficient + "";		
		}else if(coefficient == 0){			
			if(remainder < 0 && answer[1] < 0){
				int newNum = remainder * -1;
		  		int newDenom = answer[1] * -1;
		  		reducedAnswer = newNum + "/" + newDenom;
			}else{
				reducedAnswer = remainder + "/" + answer[1];
	  		}
		}else if(remainder < 0 && answer[1] < 0){
 	    	int numerator = remainder * -1;
 			int denominator = answer[1] * -1;
 			reducedAnswer = coefficient + "_" + numerator + "/" + denominator;
		}else{
			reducedAnswer = coefficient + "_" + remainder + "/" + answer[1];
		}
					    		
	   	return reducedAnswer;
	}
    
    public static String[] splitOperand(String operand){
    	String[] splitOperand = new String[3];
    	if(operand.indexOf("_") >= 0 && operand.indexOf("/") >= 0) {
    		splitOperand[0] = operand.substring(0,operand.indexOf("_"));
			splitOperand[1] = operand.substring(operand.indexOf("_")+1,operand.indexOf("/"));
			splitOperand[2] = operand.substring(operand.indexOf("/")+1);
    	}
    	else if(operand.indexOf("_") < 0 && operand.indexOf("/") >= 0) {
    		splitOperand [0] = "0";
    		splitOperand [1] = operand.substring(0, operand.indexOf("/"));
    		splitOperand [2] = operand.substring(operand.indexOf("/") + 1);
    	}
    	else if(operand.indexOf("_") < 0 && operand.indexOf("/") < 0) {
    		splitOperand [0] = operand;
    		splitOperand [1] = "0";
    		splitOperand [2] = "1";
    	}
    	return splitOperand;
    }
    
    
    public static int[] addition(String[] operand1, String[] operand2) {
    	int firstWhole = Integer.valueOf(operand1[0]);
    	int firstNumerator = Integer.valueOf(operand1[1]);
    	int firstDenominator = Integer.valueOf(operand1[2]);
    	firstNumerator = toImproperFrac(firstWhole, firstDenominator, firstNumerator);
    
    	int secondWhole = Integer.valueOf(operand2[0]);
    	int secondNumerator = Integer.valueOf(operand2[1]);
    	int secondDenominator = Integer.valueOf(operand2[2]);
    	secondNumerator = toImproperFrac(secondWhole, secondDenominator, secondNumerator);  
    	
    	int finalNumerator = (firstNumerator * secondDenominator) + (secondNumerator * firstDenominator);
    	int finalDenominator = (firstDenominator * secondDenominator);
    	int[] answer = new int[2];
    	answer [0] = finalNumerator;
    	answer [1] = finalDenominator;
    	
		return answer;
    }
    
    public static int[] subtraction(String[] operand1, String[] operand2) {
    	int firstWhole = Integer.valueOf(operand1[0]);
    	int firstNumerator = Integer.valueOf(operand1[1]);
    	int firstDenominator = Integer.valueOf(operand1[2]);
    	firstNumerator = toImproperFrac(firstWhole, firstDenominator, firstNumerator); 
    
    	int secondWhole = Integer.valueOf(operand2[0]);
    	int secondNumerator = Integer.valueOf(operand2[1]);
    	int secondDenominator = Integer.valueOf(operand2[2]);
    	secondNumerator = toImproperFrac(secondWhole, secondDenominator, secondNumerator);  
    	
    	int finalNumerator = (firstNumerator * secondDenominator) - (secondNumerator * firstDenominator);
    	int finalDenominator = (firstDenominator * secondDenominator);
    	int[] answer = new int[2];
    	answer [0] = finalNumerator;
    	answer [1] = finalDenominator;
    	
		return answer;
    }
    
    public static int[] multiplication(String[] operand1, String[] operand2) {
    	int firstWhole = Integer.valueOf(operand1[0]);
    	int firstNumerator = Integer.valueOf(operand1[1]);
    	int firstDenominator = Integer.valueOf(operand1[2]);
    	firstNumerator = toImproperFrac(firstWhole, firstDenominator, firstNumerator); 
    
    	int secondWhole = Integer.valueOf(operand2[0]);
    	int secondNumerator = Integer.valueOf(operand2[1]);
    	int secondDenominator = Integer.valueOf(operand2[2]);
    	secondNumerator = toImproperFrac(secondWhole, secondDenominator, secondNumerator); 
    	
    	int finalNumerator = firstNumerator * secondNumerator;
    	int finalDenominator = (firstDenominator * secondNumerator);
    	int[] answer = new int[2];
    	answer [0] = finalNumerator;
    	answer [1] = finalDenominator;
    	
		return answer;
    }
    
    public static int[] division(String[] operand1, String[] operand2) {
    	int firstWhole = Integer.valueOf(operand1[0]);
    	int firstNumerator = Integer.valueOf(operand1[1]);
    	int firstDenominator = Integer.valueOf(operand1[2]);
    	firstNumerator = toImproperFrac(firstWhole, firstDenominator, firstNumerator); 
    
    	int secondWhole = Integer.valueOf(operand2[0]);
    	int secondNumerator = Integer.valueOf(operand2[1]);
    	int secondDenominator = Integer.valueOf(operand2[2]);
    	secondNumerator = toImproperFrac(secondWhole, secondDenominator, secondNumerator); 
    	
    	int finalNumerator = firstNumerator * secondDenominator;
    	int finalDenominator = (firstDenominator * secondNumerator);
    	int[] answer = new int[2];
    	answer [0] = finalNumerator;
    	answer [1] = finalDenominator;
    	
    	return answer; 
    }
    
    public static int toImproperFrac(int operandA, int operandB, int operandC) {
		int toImproperFrac = (operandA * operandC + operandB);
		return toImproperFrac;
    }
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
    
    //public static String multiplication(String operand1, String operand2) {
		//return answer;
    //
}
    // TODO: Fill in the space below with any helper methods that you think you will need