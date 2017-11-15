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
    	
    	String whole = "0";
    	String numerator = "0";
    	String denominator = "1";
    	
    	String[] array1 = input.split(" ");
    	String operand2 = array1[2];
    	int underscoreCheck = operand2.indexOf("_");
    	
    	if(underscoreCheck >= 0) {
    		String[] array2 = operand2.split("_");
    		if(array2[0] != "") {
    			whole = array2[0];
    		}
    		String fraction = array2[1];
    		int backslashCheck = fraction.indexOf("/");
    		    if(backslashCheck >= 0){
    		    	String[] array3 = fraction.split("/");
    		    	if(array3[0] != "") {
    		    		numerator = array3[0];
    		    	}
    		    	if(array3[1] != "") {
    		    		denominator = array3[1];
    		    	}
    		    }
    	}
    	if(underscoreCheck < 0) {
    		int backslashCheck = operand2.indexOf("/");
    		if(backslashCheck < 0) {
    			whole = operand2;
    		}
    		else if(backslashCheck >= 0){
    			String[] array3 = operand2.split("/");
    			if(array3[0] != "") {
    				numerator = array3[0];
    			}
    			if(array3[1] != "") {
    				denominator = array3[1];
    			}
    		}
    	}
    	String statement = "whole:" + whole + " numerator:" + numerator + " denominator:" + denominator;
		return statement;
    }
}
    // TODO: Fill in the space below with any helper methods that you think you will need