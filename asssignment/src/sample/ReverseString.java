package sample;
import java.util.Scanner;
 class ReverseString {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String input = scanner.nextLine();
	        String reversed = reverseString(input);
	        System.out.println(reversed);
	    }
	    
	    public static String reverseString(String input) {
	        StringBuilder reversed = new StringBuilder();
	        for (int i = input.length() - 1; i >= 0; i--) {
	            char ch = input.charAt(i);
	            if (Character.isLetter(ch)) {
	                reversed.append(Character.toLowerCase(ch));
	            }
	        }
	        return reversed.toString();
	    }
	}


