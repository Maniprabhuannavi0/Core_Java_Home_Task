package java_language_constructs;

public class Speed_Calculate {
	public void caughtSpeeding(int speed, boolean isBirthday) {
		int result = 0;
		if (isBirthday) {
			speed = speed + 5;
		}
		if (speed <= 60) {
			result = 0;
			System.out.println(result);
		} else if (speed >= 61 && speed <= 80) {
			result = 1;
			System.out.println(result);

		} else if (speed > 80) {
			result = 2;
			System.out.println(result);

		}
	}

	public static void main(String[] args) {
		Speed_Calculate s = new Speed_Calculate();
		s.caughtSpeeding(78, true);
	}

}
