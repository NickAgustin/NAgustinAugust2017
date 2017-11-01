import java.util.Arrays;

public class LotsOfCopies 
{

	public static void main(String[] args) 
	{
		int num = 7;
		String strMain = "APCS";
		int[] arrMain = {1 ,2, 3, 4, 5};
		System.out.println(num);
		System.out.println(strMain);
		System.out.println(Arrays.toString(arrMain));
		LotsOfCopies.changeMe(num, strMain, arrMain);
		System.out.println(num);
		System.out.println(strMain);
		System.out.println(Arrays.toString(arrMain));
	}
	public static void changeMe(int x, String str, int[] arr)
	{
		x = 100;
		str = "One Hundred";
		arr[0] = 101;
		arr[1] = 102;
		arr[2] = 103;
		arr[3] = 104;
		arr[4] = 105;		
	}
}
