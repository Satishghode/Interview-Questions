package array;

import java.util.Scanner;

/*
 	Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
 	 The order of the elements may be changed. Then return the number of elements in nums
 	  which are not equal to val.
 
 * */


public class RemoveEleent {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Array size : ");
		int[] arr = new int[scanner.nextInt()];
		
		System.out.print("Ente value to remove array: ");
		int value = scanner.nextInt();
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = scanner.nextInt();
		}
		
		int ans = (int) removeElement(arr, value)[0];
		int[] ansArr = (int[]) removeElement(arr, value)[1]; 
		
		System.out.println(ans);

	}
	static Object[] removeElement(int[] arr, int value) {
		Object result[] = new Object[2];
		
		int count = 0 ; 
		int ans[] = new int[count];
		for(int i=0 ; i<arr.length ; i++ ) {
			if(arr[i] != value) {
				ans[count] = arr[i];
				count++;
			}
		}
		result[0] = count;
		result[1] = ans;
		
		return result; 
		
		
	
	}
	
	

}
