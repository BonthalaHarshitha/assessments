package sample;
import java.util.Scanner;

public class SmallestVowel {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String input = scanner.nextLine();
	        char smallestVowel = findSmallestVowel(input);
	        System.out.println(smallestVowel);
	        scanner.close();
	    }

	    public static char findSmallestVowel(String input) {
	        char smallestVowel = '\0';
	        for (int i = 0; i < input.length(); i++) {
	            char ch = Character.toLowerCase(input.charAt(i));
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                if (smallestVowel == '\0' || ch < smallestVowel) {
	                    smallestVowel = ch;
	                }
	            }
	        }
	        return smallestVowel;
	    }
	}


