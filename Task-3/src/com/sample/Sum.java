package com.sample;

import java.util.Arrays;
import java.util.List;
public class Sum {

		
		    public static int sumOfEvenNumbers(List<Integer> numbers) {
		        return numbers.stream()
		                      .filter(n -> n % 2 == 0)
		                      .mapToInt(Integer::intValue)
		                      .sum();
		    }
		    public static int sumOfOddNumbers(List<Integer> numbers) {
		        return numbers.stream()
		                      .filter(n -> n % 2 != 0)
		                      .mapToInt(Integer::intValue)
		                      .sum();
		    }

		    public static void main(String[] args) {
		        List<Integer> numbers = Arrays.asList(8,19,73,62,27,72,282,27,72,82);

		        int sumEven = sumOfEvenNumbers(numbers);
		        int sumOdd = sumOfOddNumbers(numbers);

		        System.out.println("Sum of even numbers: " + sumEven);
		        System.out.println("Sum of odd numbers: " + sumOdd);
		        }
}
	
