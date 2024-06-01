package sample;
import java.util.Scanner;

public class vowelnConsonants {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	
	        System.out.println("Enter the string:");
	        String input = scanner.nextLine();

	     
	        countVowelsAndConsonants(input);

	        scanner.close();
	    }

	    public static void countVowelsAndConsonants(String input) {
	     
	        input = input.toLowerCase();

	  
	        int vowelsCount = 0;
	        int consonantsCount = 0;

	  
	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);

	        
	            if (Character.isAlphabetic(ch)) {
	              
	                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                    vowelsCount++;
	                } else {
	                    consonantsCount++;
	                }
	            }
	        }

	     
	        System.out.println("Vowels count - " + vowelsCount);
	        System.out.println("Consonants count - " + consonantsCount);
	    }
	}


