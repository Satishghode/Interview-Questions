package array;

import java.util.Scanner;


//Program to print the elements of an array in reverse order

public class ReverseArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Array Size: ");
		 int arr[] = new int[scanner.nextInt()];
		 
		 for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		 reverseArray(arr);
	}
	
	public static void reverseArray(int arr[]) {
		System.out.print("{ ");
		for (int i = arr.length-1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("}");
	}

}
