package java_language_constructs;

public class six_greate_number {
	public boolean test(int a, int b) {

		int dif_ab = Math.abs(a - b);
		int dif_ba = Math.abs(b - a);

		// Check Numbers
		if (a == 6 || b == 6) {
			return true;
		}

		// Check Sum
		else if (a + b == 6) {
			return true;
		}

		// Check difference
		else if (dif_ab == 6 || dif_ba == 6) {
			return true;
		}

		return false;
	}

	public void testing() {
		// TODO Auto-generated method stub
		boolean c = test(6, 6);
		System.out.println(c);
	}

	public static void main(String[] args) {
		six_greate_number s = new six_greate_number();
		s.testing();
	}
}
