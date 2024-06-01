package sample;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
public class unique {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String input = scanner.nextLine().toLowerCase();
	        printUniqueCharacters(input);
	        scanner.close();
	    }

	    public static void printUniqueCharacters(String input) {
	        Set<Character> uniqueChars = new LinkedHashSet<>();
	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);
	            uniqueChars.add(ch);
	        }
	        for (char ch : uniqueChars) {
	            System.out.print(ch);
	        }
	    }
	

}
