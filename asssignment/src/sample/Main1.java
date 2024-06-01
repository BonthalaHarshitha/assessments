package sample;
import java.util.Scanner;

public class Main1 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int number = scanner.nextInt();
	        boolean isPerfectSquare = checkPerfectSquare(number);
	        System.out.println(isPerfectSquare ? "TRUE" : "FALSE");
	        scanner.close();
	    }

	    public static boolean checkPerfectSquare(int number) {
	        // Edge case: If the number is negative, return false
	        if (number < 0) {
	            return false;
	        }

	        // Find the square root of the number
	        double squareRoot = Math.sqrt(number);

	        // Check if the square root is an integer
	        return squareRoot - Math.floor(squareRoot) == 0;
	    }
	}


