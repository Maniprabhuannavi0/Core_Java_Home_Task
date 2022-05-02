package java_language_constructs;

public class Test10 {
	public int sumNumbers(String str) {
		int sum = 0, num = 0;
		for (char c : (str + ".").toCharArray())
			if (Character.isDigit(c))
				num = num * 10 + (c - '0');
			else {
				sum += num;
				num = 0;
			}
		return sum;
	}
	private void test() {
		// TODO Auto-generated method stub
		int s = sumNumbers("mandjhscjabkabc123xybcjbacjbsjwdi");
		System.out.println(s);
	}

	public static void main(String[] args) {
		Test10 t = new Test10();
		t.test();
	}
}
