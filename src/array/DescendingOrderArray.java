package array;

import java.util.Scanner;

//Program to sort the elements of an array in descending order.



public class DescendingOrderArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print("Enter the Array Size:  ");
		int  size = scanner.nextInt();
		int arr[] = new int[size];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]= scanner.nextInt();
		}
		
		printArray(arr);
		sortArray(arr);
		printArray(arr);
	}
	
//	 print the array using the for-each loop
	public static void printArray(int[] arr) {
		System.out.print("{ ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println("}");
		
	}
	// Sort the array 
	public static int[] sortArray(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1 ; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j]= temp;
				}
			}
		}
		return arr;
	}
	
}
