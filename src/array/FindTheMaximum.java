package array;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class FindTheMaximum {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the array Size:");
		int arr[] = new int[scanner.nextInt()];
		 
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		
		int ans =  findMaximumNum(arr);
		System.out.println(ans);
	}
	
	public static int findMaximumNum(int arr[]) {
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j] ) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		int min = arr[arr.length-1];
		return min;
	}
	
}
