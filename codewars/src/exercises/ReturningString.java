package exercises;

import java.lang.String;

/*
Make a function that will return a greeting statement that uses an input; your program should return, "Hello, <name> how are you doing today?".

[Make sure you type the exact thing I wrote or the program may not execute properly]
*/

public class ReturningString {
	public static void main(String... args){
		System.out.println(ReturningString.greet("Caio"));
	}
	
	public static String greet(String name){
		return String.format("Hello, %s how are you doing today?", name);
	}
}