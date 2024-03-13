package array;

import java.util.Scanner;

public class SumOFTarget {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Array Size :");
		int size = scanner.nextInt();
		int arr[] = new int[size];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]= scanner.nextInt();
		}
		System.out.print("Enter the Target Number : ");
		int target = scanner.nextInt();
		
		//call SLn Method 
		 int[] ans = sumOfTarger(arr, target);
		 for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
		
		
		
	}
	public static int [] sumOfTarger (int arr[], int target ) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+	1; j < arr.length; j++) {
				if(arr[i] + arr[j] ==  target ) { //  if this condition is true arr[i] + arr[j] == target; 
					return new int[] {i,j}; // the return the index number.
				}
			}
		}
		return new int[] {} ; // if there no solution not Found, Then return the empty. array 
	}
	
	

}
