package Basic;
import java.util.Scanner;

public class MemberofArithmeticProgression {
	
	public static boolean isMemberofAP(int a, int d, int x) {
		
		if (d == 0) {
			return a == x;
		}
		else if ((x-a) % d == 0) {
			return true;
		}
		return false;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number of AP:");
		int a = sc.nextInt();
		System.out.println("Enter difference:");
		int d = sc.nextInt();
		System.out.println("Enter potential member of AP:");
		int x = sc.nextInt();
		System.out.println(isMemberofAP(a,d,x));
	}

}
