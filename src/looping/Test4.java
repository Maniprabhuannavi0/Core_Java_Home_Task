package looping;

public class Test4 {
public static void main(String[] args) {
	try {
        throw new Exception("This is a custom message");
     } catch(Exception e) {
        System.out.println(e);
     }
}
}
