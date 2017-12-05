package Basic;
import java.util.Arrays;

public class UnionIntersectionUsingBinarySearch {
	public static int binarySearch (int[] arr, int l, int r, int x) {
		
		int mid = l + (r-1)/2;
		if (r >= l) {
		if (x == arr[mid]) {
			return mid;
		}
		// If the number to be searched is less than mid point, search from left up to mid
		else if (x < arr[mid]) {
			
			return binarySearch(arr, l, mid-1, x);
		}
		// If the number to be searched is greater than mid point, search from mid to right

			return binarySearch(arr, mid+1, r, x);
		
		}
		return -1;
	}
	
	public static void union(int[] arr1, int[] arr2, int m, int n) {
		
		//Make sure the array 1 has fewer elements to make sorting easier. Else swap it out
		
		if (m > n) {
			
			int[] temp = arr1;
			arr1 = arr2;
			arr2 = temp;
			
			int temp1 = m;
			m = n;
			n = temp1;			
		}
	   // Array 1 is shorter than array 2. Hence sort it		
		Arrays.sort((arr1));
		for (int j=0; j < m; j++) {
			System.out.print(arr1[j] + " ");
		}
		for (int i=0; i<n; i++) {
		if (binarySearch(arr1, 0, m-1, arr2[i]) == -1) {
			System.out.print(arr2[i] + " ");
		}
		}
	}
	
public static void intersection(int[] arr1, int[] arr2, int m, int n) {
		
		//Make sure the array 1 has fewer elements to make sorting easier. Else swap it out
		
		if (m > n) {
			
			int[] temp = arr1;
			arr1 = arr2;
			arr2 = temp;
			
			int temp1 = m;
			m = n;
			n = temp1;			
		}
	   // Array 1 is shorter than array 2. Hence sort it		
		Arrays.sort((arr1));
		for (int i=0; i<n; i++) {
		if (binarySearch(arr1, 0, m-1, arr2[i]) != -1) {
			System.out.print(arr2[i] + " ");
		}
		}
	}
	
	public static void main(String args[]) {
		UnionIntersectionUsingBinarySearch uib = new UnionIntersectionUsingBinarySearch();
		
		int[] arr1 = {11,2,3,44,5,2};
		int[] arr2 = {2,9,55,11};
		int m = arr1.length;
		int n = arr2.length;
		uib.union(arr1, arr2, m, n);
		System.out.println("Intersection");
		uib.intersection(arr1, arr2, m, n);	
	}
}
