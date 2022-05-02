package java_language_constructs;

public class Test8 {
	public String withoutString(String base, String remove) {
		String result = "";
		int b = base.length();
		int r = remove.length();

		for (int i = 0; i < b; i++) {
			if (i < b - r + 1 && base.substring(i, i + r).toLowerCase().equals(remove.toLowerCase())) {
				i = i + r - 1;
				continue;
			}
			result += base.substring(i, i + 1);
		}
		return result;
	}

	private void test() {
		// TODO Auto-generated method stub
		String s = withoutString("mani", "Man");
		System.out.println(s);
	}

	public static void main(String[] args) {
		Test8 t = new Test8();
		t.test();
	}
}
