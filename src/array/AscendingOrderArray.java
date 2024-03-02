package array;

import java.util.Scanner;


// Java Program to sort the elements of an array in ascending order

public class AscendingOrderArray {
	// this is an main method 
	public static void main(String[] args) {
		
		Scanner scanner = new  Scanner(System.in);
		System.out.println(" Enter the array size :  ");
		int size = scanner.nextInt();
		int arr[] = new int[size];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scanner.nextInt();
		}
		printArray(arr);
		SortArray(arr);
		printArray(arr);
	}
	
	// this method is used to sort of an array 
	public static int[] SortArray( int arr[] ) {
	
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1 ; j < arr.length; j++) {
				if(arr.length < 0){
					System.out.println("Array size should be > 0 ");
					break;
				}
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j]= temp;
				}
			}
		}
		return arr;
	}
	
	//  Print the array 
	public static void printArray(int[] arr) {
		System.out.print("{ ");
		for (int i = 0; i < arr.length; i++) {
		 System.out.print( arr[i] +" " );
		}
		System.out.println("}");
		
	}
	
}
	