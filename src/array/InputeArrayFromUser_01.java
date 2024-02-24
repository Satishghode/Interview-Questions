package array;

import java.util.Scanner;

public class InputeArrayFromUser_01 {
	public static void main (String args[]){
        Scanner scanner = new Scanner(System.in); // It allows to Input form The user
        System.out.print("Enter the array Size : ");
        int arr[] = new int[scanner.nextInt()]; // declare the array

        for (int i = 0; i < arr.length; i++) { // iterate the arr.length-1
            arr[i] = scanner.nextInt(); // it allows to take the input form the user one by one and stored inside the arr variables.
        }

        // traversing the array using for-loop
        System.out.println("Traversing the array using For loop ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        

        // Traversing the array using the For-each ;
        System.out.println("Traversing the array using the for-each");
        for (int i :arr ) {
            System.out.print(i + " " );
        }
        System.out.println();


        // Traversing the array Using User Dif method
        printArray(arr);

    }

    public static void printArray(int arr[]){
    	System.out.println("Traversing the array Using User Dif method");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
