package pekan6;


	import java.util.Scanner;

	public class doWhile1 {
	    public static void main(String[] args) {
	        try (Scanner console = new Scanner(System.in)) {
				String phrase;
				
				do {
				    System.out.print("Input Password: ");
				    phrase = console.next();
				} while (!phrase.equals("abcd"));
			}
	    }
	}