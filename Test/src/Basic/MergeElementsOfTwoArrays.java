package Basic;

public class MergeElementsOfTwoArrays {
	
	public static void main(String args[]) {
		
		int a1[] = {1,2,3,4,5};
		int a2[] = {6,7,8,9,10,11,12};
		
		int m = a1.length;
		int n = a2.length;
		
		// Always make sure first array is smaller 
		
		if (m > n) {
			int temp[] = a1;
			a1 = a2;
			a2 = temp;
			
			int tempLength = m;
			m = n;
			n = tempLength;		
		}
	  // Now we know first array is smaller 
		int newArray[] = new int[m+n];
		for (int i = 0, int j =0; i < m, j < n; i++) {
			
			newArray[i+
			
		}
	}

}
