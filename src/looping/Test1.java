package looping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1 {
public static void main(String[] args) throws Throwable, IOException {

	 BufferedReader keyboard = new BufferedReader (new InputStreamReader (System.in));
	 
	 System.out.println("Enter Number:");
	 int as= Integer.parseInt (keyboard.readLine());
	 System.out.println("Enter X:");
	 int x=   Integer.parseInt (keyboard.readLine());
	 
	 int y = 0;
	 
	 for(int i=0; i<= as ;i++){
	 
	 for(int j=1; j <= i ; j++){
	 System.out.print(y + " ");
	 y = y + x;
	 }
	 
	 System.out.println("");
	 }
	 }
	

}
