package fracCalc;
import java.util.Arrays;
import java.util.Scanner;
public class FracCalc {

    public static void main(String[] args) 
    {
    	Scanner userInput = new Scanner(System.in);
    	String input = userInput.toString();
    	boolean condition = true;
    	do {
    		FracCalc.produceAnswer(input);
    	String status = userInput.toString();
    	if(status == "quit") {
    		condition = false;
    	}
    	else {
    		condition = true;
    	}
    }
    	while(condition != true);
        // TODO: Read the input from the user and call produceAnswer with an equation
    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input){ 
    	
    	String answerFraction = "0/0";
    	
    	String[] array1 = input.split(" ");
    	String operand1 = array1[0];
    	String operator = array1[1];
    	String operand2 = array1[2];
    	/*int underscoreCheck = operand2.indexOf("_");
    	
    	if(underscoreCheck >= 0) {
    			whole = FracCalc.underscoreSplit(operand2)[0];
    		String fraction = FracCalc.underscoreSplit(operand2)[1];
    		int backslashCheck = fraction.indexOf("/");
    		    if(backslashCheck >= 0){
    		    	numerator = FracCalc.backslashSplit(fraction)[0];
    		    	denominator = FracCalc.backslashSplit(fraction)[1];
    		    }
    	}
    	if(underscoreCheck < 0) {
    		int backslashCheck = operand2.indexOf("/");
    		if(backslashCheck < 0) {
    			whole = operand2;
    		}
    		else if(backslashCheck >= 0){
    			numerator = FracCalc.backslashSplit(operand2)[0];
    			denominator = FracCalc.backslashSplit(operand2)[1];
    		}
    	}*/
    	String answer = answerFraction;
		return answer;
    }
    public static String[] underscoreSplit(String operand){
		String[] usArray = operand.split("_");
		return usArray;
    }
    public static String[] backslashSplit(String operand){
    		String[] bsArray = operand.split("/");
    		return bsArray;
    }
    public static String addition(String operand1, String operand2) {
    	FracCalc.
		return answer;
    }
    public static String multiplication(String operand1, String operand2) {
		return answer;
    }
}
    // TODO: Fill in the space below with any helper methods that you think you will need