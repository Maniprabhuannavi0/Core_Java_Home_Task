package java_language_constructs;

public class tea_and_candy {
	public int teaParty(int tea, int candy) {
		if (tea <= 5 || candy <= 5) {
			return 0;
		}
		if (candy < (2 * tea) && tea < (2 * candy)) {
			return 1;
		}
		return 2;
	}

	private void tests() {
		// TODO Auto-generated method stub
		int a = teaParty(6, 8);
		System.out.println(a);
	}
	public static void main(String[] args) {
		tea_and_candy t=new tea_and_candy();
		t.tests();
	}
}
