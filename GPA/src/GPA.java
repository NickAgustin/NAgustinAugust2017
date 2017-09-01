/*Nick Agustin
APCS2
September 1st, 2017
*/
public class GPA {
	public static void main(String[] args) {
		double realGPA = calcGPA(3.5, 4.0, 3.0, 4.0, 3.5);
		System.out.println(realGPA);
		
	}
	public static double calcGPA(double economics, double apcs, double japanese, double calcAB, double english ){
		double calcSum = (economics + apcs + japanese + calcAB + english);
		double totalGPA = (calcSum/5);
		return totalGPA;
	}
}
