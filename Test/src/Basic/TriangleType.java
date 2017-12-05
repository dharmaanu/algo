package Basic;
import java.util.Scanner;

public class TriangleType {

	public String checkTriangleType(int s1, int s2, int s3) {
		if (s1==s2  && s2==s3) {
			return "Triangle is equilateral";
		}

		if ((s1+s2) <= s3 || (s2+s3) <= s1 || (s3+s1) <= s2) {
			return "Not a triangle";
		}

		if ((s1==s2 && s1!=s3) || (s2==s3 && s2!=s1) || (s1==s3 && s1!=s2)) {
			return "Isoceles";
		}
		return "Triangle is scalene";
	}
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first side:");
		int s1 = sc.nextInt();
		System.out.println("Enter second side:");
		int s2 = sc.nextInt();
		System.out.println("Enter third side:");
		int s3 = sc.nextInt();
		TriangleType tri = new TriangleType();
		System.out.println(tri.checkTriangleType(s1, s2, s3));

	}
}
