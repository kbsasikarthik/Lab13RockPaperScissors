package lab13;
//@ Sasikaladevi Kumarasamy
// this program checks for validity of many types of data, each in a different method. 
// It even checks if the user input data is within range mentioned or not(where applicable)
import java.util.Scanner;

public class Validator {
	Scanner sc = new Scanner(System.in);

	// prints the prompt and returns the user entered string
	public static String getString(Scanner sc, String prompt) {
		System.out.print(prompt);
		return sc.nextLine();
	}

		
	// checks the user input string matches the RegEx pattern or not. 
	// It keeps asking until valid entry is made.
	public static String getRegExString(Scanner sc,String prompt,String regExPattern ) {
		boolean isValid = false;
		String userInput="";
		while(!isValid) {
			userInput = getString(sc, prompt).toLowerCase();
			if (!(userInput.matches(regExPattern))) {
				System.out.println("Invalid entry! Please try again.");
				continue;
			}else
				isValid = true;
			
		}	
		return userInput;
	}
		
	

}
