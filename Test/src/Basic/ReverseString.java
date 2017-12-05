package Basic;

public class ReverseString {
	
	public static void main(String args[]) {
		String s = "KEEP IT UP";
		char c[] = s.toCharArray();
		StringBuilder str = new StringBuilder();
		for (int i = c.length-1; i >=0; i--) {
	        str.append(c[i]);
		}
		System.out.println(str);
	}
 
}
