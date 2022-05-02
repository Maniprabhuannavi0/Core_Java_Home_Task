package looping;

public class Test3 {
	  private final String value;
	    private final String type;

	    public Test3(int x) {
	        this(Integer.toString(x), "int");
	        System.out.println(x);
	    }

	    public Test3(boolean x) {
	        this(Boolean.toString(x), "boolean");
	        System.out.println(x);
	    }

	    private Test3(String value, String type) {
	        this.value = value;
	        this.type = type;
	        System.out.println(value+" "+type);
	    }
	   
}
