package array;

import java.util.HashMap;
import java.util.Scanner;

//Find unique elements in array Java


public class UniqueElementsInArray {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the array Size: ");
		int size = scanner.nextInt();
		int arr[] = new int[size];
		
		// get the array from the user  using while loop
		int i = 0 ;
		while ( i < arr.length ) {
			arr[i] = scanner.nextInt();
			i++;
		}
		
		// Create an hash  map 
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		// use the for loop to pull the elements of array in HashMap; 
		for (int j = 0; j < arr.length; j++) {
			map.put(arr[j], j);
		}
		
//		use HashMap.keyset() for printing all the key of the HashMap using the keySet() method. 
		System.out.println(map.keySet());
		
		
		
	}
}
