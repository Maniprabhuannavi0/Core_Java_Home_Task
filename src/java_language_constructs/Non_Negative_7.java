package java_language_constructs;

public class Non_Negative_7 {
	public static int sumLimit2(int a, int b) {
		String str = Integer.toString(a + b);
		String str2 = Integer.toString(a);
		if (str.length() == str2.length()) {
			return a + b;
		}
		return a;
	}
}
