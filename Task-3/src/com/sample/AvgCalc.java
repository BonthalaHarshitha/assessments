package com.sample;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
public class AvgCalc {
		    public static void main(String[] args) {
		        // List of integers
		        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

		        // Calculating the average using streams
		        OptionalDouble average = numbers.stream()
		                                        .mapToInt(Integer::intValue)
		                                        .average();

		        // Checking if a value is present and printing the average
		        if (average.isPresent()) {
		            System.out.println("The average is: " + average.getAsDouble());
		        } else {
		            System.out.println("The list is empty, no average to calculate.");}}
}
