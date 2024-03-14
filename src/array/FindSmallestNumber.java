package array;

import java.util.Scanner;

public class FindSmallestNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Array Size : ");
		int size = scanner.nextInt();
		int arr[] = new int[size];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scanner.nextInt();
		}
		
		// call the Method 
		System.out.println("Smallest number In the Array : " +smallestNumber(arr));
		
		
	}
	
	public static int smallestNumber(int arr[]) {
		
		for (int i = 0 ; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if ( arr[i] < arr[j]  ) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp ; 
				}
			}
		}
		return arr[0];
		
	}
	

}
