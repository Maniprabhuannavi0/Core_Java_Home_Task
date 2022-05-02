package java_language_constructs;

public class Test9 {
	public int maxBlock(String str) {
		if(str.length() == 0){
		return 0;
		}
		int max = 1;
		int counter = 1;
		for (int i = 0; i < str.length() - 1; i++){
		if(str.charAt(i) == str.charAt(i + 1)){
		counter++;
		if(counter > max){
		max = counter;
		}
		}else{
		counter = 1;
		}
		}
		return max;
		}
	
	private void test() {
		// TODO Auto-generated method stub
		int s = maxBlock("fqshyqfusfqgsggqs");
		System.out.println(s);
	}

	public static void main(String[] args) {
		Test9 t = new Test9();
		t.test();
	}
}
