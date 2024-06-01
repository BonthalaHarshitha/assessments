package sample;

import java.util.Scanner;

public class Solution14 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        Payer[] payers = new Payer[4];
	        for (int i = 0; i < 4; i++) {
	            int id = scanner.nextInt();
	            String name = scanner.next();
	            int iccRank = scanner.nextInt();
	            int matchesPlayed = scanner.nextInt();
	            int runsScored = scanner.nextInt();
	            payers[i] = new Payer(id, name, iccRank, matchesPlayed, runsScored);
	        }

	        int target = scanner.nextInt();

	        double[] averages = findAverageOfRuns(payers, target);
	        for (double average : averages) {
	            if (average >= 80 && average <= 100) {
	                System.out.println("Grade A");
	            } else if (average >= 50 && average <= 79) {
	                System.out.println("Grade B");
	            } else {
	                System.out.println("Grade C");
	            }
	        }

	        scanner.close();
	    }

	    public static double[] findAverageOfRuns(Payer[] payers, int target) {
	        double[] averages = new double[payers.length];
	        for (int i = 0; i < payers.length; i++) {
	            if (payers[i].getMatchesPayed() >= target) {
	                averages[i] = (double) payers[i].getRunsScored() / payers[i].getMatchesPayed();
	            } else {
	                averages[i] = 0;
	            }
	        }
	        return averages;
	    }
	

}


