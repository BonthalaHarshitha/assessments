package sample;
import java.util.*;
import java.util.stream.Collectors;

public class Prime {

	public class PrimeSequenceValidation {

	    public static void main(String[] args) {
	  
	        String input = "233 2435 1123 109 103 4434 2347 993 880 1117 1801 991;";

	
	        input = input.replace(";", "").trim();
	        String[] numberStrings = input.split(" ");

	 
	        List<Integer> numbers = Arrays.stream(numberStrings)
	                                      .map(Integer::parseInt)
	                                      .collect(Collectors.toList());

	  
	        List<Integer> primes = numbers.stream()
	                                      .filter(PrimeSequenceValidation::isPrime)
	                                      .collect(Collectors.toList());


	        if (primes.size() < 2) {
	            throw new IllegalArgumentException("There should be at least two prime numbers in the input list.");
	        }

	        Collections.sort(primes);

	        int totalPrimes = primes.size();

	        int secondLargestPrime = primes.get(primes.size() - 2);

	        int result = totalPrimes + secondLargestPrime;

	        System.out.println(result);
	    }

	    private static boolean isPrime(int number) {
	        if (number <= 1) {
	            return false;
	        }
	        if (number == 2) {
	            return true;
	        }
	        if (number % 2 == 0) {
	            return false;
	        }
	        int sqrt = (int) Math.sqrt(number);
	        for (int i = 3; i <= sqrt; i += 2) {
	            if (number % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	}

}
