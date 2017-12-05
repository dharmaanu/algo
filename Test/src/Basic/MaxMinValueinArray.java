package Basic;

import java.util.Scanner;

public class MaxMinValueinArray {
	
	public static int maxValue(int[] arr) {
		int max = arr[0];
		
		for (int i=1; i < arr.length; i++) {
			max = max < arr[i] ? arr[i] : max;
		}		
		return max;
	}
	public static int minValue(int[] arr) {
		int min = arr[0];
		
		for (int i=1; i < arr.length; i++) {
			min = min > arr[i] ? arr[i] : min;
		}		
		return min;
	}
	
	public static void main(String args[]) {	
		int arr[] = {9, 18, 10, -81, 34};
		System.out.println(maxValue(arr));
		System.out.println(minValue(arr));
	}
}
