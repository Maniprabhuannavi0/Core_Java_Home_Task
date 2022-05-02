package java_language_constructs;

public class order_returning {
	public boolean inOrder(int a, int b, int c, boolean bOk) {

		if (bOk) {
			if (c > b) {
				return true;
			} else {
				return false;
			}
		}

		if (b > a && c > b) {
			return true;
		} else {
			return false;
		}

	}

}
