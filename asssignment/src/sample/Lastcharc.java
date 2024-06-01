package sample;

public class Lastcharc {
	    public static void main(String[] args) {
	        String input = "Hey3 Java   Learners";
	        System.out.println(getLastCharsOfWords(input));
	    }

	    public static String getLastCharsOfWords(String input) {
	        StringBuilder result = new StringBuilder();
	        String[] words = input.split("\\s+");

	        for (String word : words) {
	            if (!word.isEmpty()) {
	                int len = word.length();
	                char lastChar = word.charAt(len - 1);
	                
	                if (Character.isLetter(lastChar)) {
	                    result.append(lastChar);
	                }
	            }
	        }
	        
	        return result.toString();
	    }
	}


