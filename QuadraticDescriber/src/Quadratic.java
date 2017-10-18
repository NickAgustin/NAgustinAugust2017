
public class Quadratic {
	public static String quadForm(int operandA, int operandB, int operandC) {
		double ad = operandA;
		double bd = operandB;
		double cd = operandC;
		double xd = 0;
		if(ad > 0) {
			String opens = ("Up");
		}
		else if(ad < 0) {
			String Open = ("Down");
		}
		double axisOfSymmetry = -bd / 2*(ad);
		double vx = (-1 * bd) /(2 * ad);
		double vy = (((4 * ad * cd) - (bd * 2)) - 4 * ad);
		double d = Calculate.discriminant(ad, bd, cd);
		   if(d > 0) {
		    String roots = ("No real roots!");
		    }
		    else {
		    	if (d == 0) {
		    		xd = Calculate.round2((-operandB/(2*operandA)));
		    			String amountOfRoots = ("There is one root!");
		    			String roots = "" + xd;
		    		return roots;
		    	}
		    	else {
		    		String amountOfRoots = ("There are two roots!");
		    		double firstroot = Calculate.round2((- operandB + Calculate.sqrt(d))/(2*operandA));
		    		double secondroot = Calculate.round2((- operandB - Calculate.sqrt(d))/(2*operandA));
		    		String roots = firstroot + " " + secondroot;
 		    		return roots;
		    		}
		    }
		return String;
		  
		 }
	public static void main(String[] args) {
	}
}

