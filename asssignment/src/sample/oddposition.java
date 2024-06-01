package sample;
import java.util.*;

public class oddposition {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String input = scanner.nextLine();
	        scanner.close();

	        StringBuilder result = new StringBuilder();

	        // Iterate through the string and append characters at odd positions
	        for (int i = 1; i < input.length(); i += 2) {
	            result.append(input.charAt(i));
	        }

	        // Print the result
	        System.out.println(result.toString());
	    }
	}


