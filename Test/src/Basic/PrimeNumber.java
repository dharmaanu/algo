package Basic;
import java.util.Scanner;

public class PrimeNumber {
	
	public static String primeNumber(int num) {
	String result = "prime";
		for (int i=2; i< num; i++) {
          if (num % i == 0) {
        	     result = "Not prime";
        	     break;
          }
		}
		return result;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check for prime:");
		int number = sc.nextInt();
		System.out.println(primeNumber(number));
		
	}
}
