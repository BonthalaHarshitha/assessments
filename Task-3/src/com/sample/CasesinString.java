package com.sample;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class CasesinString {
	    public static List<String> toUpperCase(List<String> strings) {
	        return strings.stream()
	                      .map(String::toUpperCase)
	                      .collect(Collectors.toList());
	    }
	    public static List<String> toLowerCase(List<String> strings) {
	        return strings.stream()
	                      .map(String::toLowerCase)
	                      .collect(Collectors.toList());
	    }

	    public static void main(String[] args) {
	        List<String> strings = Arrays.asList("beautiful", "world", "makes", "people","happy");

	     
	        List<String> upperCaseStrings = toUpperCase(strings);
	        System.out.println("Uppercase: " + upperCaseStrings);

	        
	        List<String> lowerCaseStrings = toLowerCase(strings);
	        System.out.println("Lowercase: " + lowerCaseStrings);}
	}
	 class Stringcase1 {
		public class StringCaseConverter {

		    // Method to convert list of strings to uppercase
		    public static List<String> toUpperCase(List<String> strings) {
		        return strings.stream()
		                      .map(String::toUpperCase)
		                      .collect(Collectors.toList());
		    }
		    public static List<String> toLowerCase(List<String> strings) {
		        return strings.stream()
		                      .map(String::toLowerCase)
		                      .collect(Collectors.toList());
		    }

		    public static void main(String[] args) {
		        List<String> strings = Arrays.asList("harshitha","java","welcome");
		        List<String> upperCaseStrings = toUpperCase(strings);
		        System.out.println("Uppercase: " + upperCaseStrings);
		        List<String> lowerCaseStrings = toLowerCase(strings);
		        System.out.println("Lowercase: " + lowerCaseStrings);}
		}

	}

