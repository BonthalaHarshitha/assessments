package sample;
import java.util.Scanner;

public class SpaceChar {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Read the input string
	        String input = scanner.nextLine();

	        // Call the method to count spaces and characters
	        countSpacesAndCharacters(input);

	        scanner.close();
	    }

	    public static void countSpacesAndCharacters(String input) {
	        int spacesCount = 0;
	        int charactersCount = 0;

	        // Iterate through each character in the input string
	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);

	            // Check if the character is a space or a non-digit character
	            if (ch == ' ') {
	                spacesCount++;
	            } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
	                charactersCount++;
	            }
	        }

	        // Print the counts
	        System.out.println("No of spaces : " + spacesCount + " and characters : " + charactersCount);
	    }
	}


