package com.citicorp.grad2014;
import java.util.Scanner;


public class QuickSort {
	
	private static int[] userInput = new int[5];
	private static int pivot ;
	private static Scanner scanner; 

	public static void main(String [] args){
		

		
		scanner = new Scanner(System.in);
		
		for ( int i = 0 ; i < 5 ; i++)
		{
		 userInput[i] = scanner.nextInt();
		} 
		
		
		quickSort( 0, userInput.length-1);
		
		System.out.println("Sorted");
		
		for ( int i = 0 ; i < 5 ; i++)
		{
		 System.out.println(userInput[i]);
		} 
		
	}
	
	static void quickSort( int left, int right ){
		
		int low = left, high = right;
			pivot = userInput[high];  //pivot selection last element
		 
		
		while (low<=high){
			
			while(userInput[low]<pivot){
				low++;
			}
			
			
			while(userInput[high]>pivot){
				high--;
			}
			
			
			if(low<=high){
				swap(low,high);
				high--;
				low ++;
			}
			
			
			
		}
		
	//	swap(low,right);
		
		
		if(left < high)
			quickSort(left, high);
		
		if(right>low)
			quickSort(low,right);
		
		
		
	}
	
 private	static void swap(int first, int second){
		
		int temp = userInput[second];
		userInput[second] = userInput[first];
		userInput[first] = temp;
		
	}
	
	
	
}
