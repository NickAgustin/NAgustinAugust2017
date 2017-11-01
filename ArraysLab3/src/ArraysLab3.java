import java.util.Arrays;

public class ArraysLab3 {

	public static int [] sum(int[] arr1, int[] arr2) {
		int[] arr3 = new int[arr1.length]; 
		for(int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i] + arr2[i];
		}
		return arr3;
	}
	public static int[] append(int[] arr, int num) {
		int[] arrAppend = new int[arr.length + 1];
		for(int i = 0; i < arr.length; i++) {
			arrAppend[i] = arr[i];
			arrAppend[arr.length - 1] = num;
		}
		return arrAppend;
	}
	public static int[] remove(int[] arr, int idx) {
		int[] arrRemove = new int[arr.length - 1];
		for(int i = 0; i < idx; i++) {
			arrRemove[i] = arr[i];
		}
		for(int j = idx + 1; j < arr.length; j++) {
			arrRemove[j-1
			          ] = arr[j];
		}
		return arrRemove;
	}
	public static int sumEven(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i+=2) {
			sum = arr[i];
		}
		return sum;
	}
	public static void rotateRight(int[] arr){
		int endValue = arr[arr.length - 1];
		for(int i = 0; i < arr.length; i++) {
		arr[i + 1] = arr[i];
		}
		arr[0] = endValue;
	}
	public static void main(String[] args) {
		int[] a1 = {5, 10, 15, 20, 25, 30, 35, 40};
		int[] a2 = {7, 14, 21, 28, 35, 42, 49, 56};
		int[] sumArr = (ArraysLab3.sum(a1, a2));
		int appendNum = 200;
		int[] appendArr = (ArraysLab3.append(a1, appendNum));
		int removeIdx = 5;
		int [] removeArr = (ArraysLab3.remove(a2, removeIdx));
		int sumOfEvens = (ArraysLab3.sumEven(appendArr));
		ArraysLab3.rotateRight(a1);
		System.out.println(Arrays.toString(sumArr));
		System.out.println(Arrays.toString(appendArr));
		System.out.println(Arrays.toString(removeArr));
		System.out.println(sumOfEvens);
		System.out.println(Arrays.toString(a1));
	}
}
