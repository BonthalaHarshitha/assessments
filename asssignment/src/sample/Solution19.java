package sample;

import java.util.Arrays;
import java.util.Scanner;

public class Solution19 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Sim[] sims = new Sim[5];

	        // Read Sim objects
	        for (int i = 0; i < 5; i++) {
	            int simId = scanner.nextInt();
	            scanner.nextLine(); // Consume newline
	            String customerName = scanner.nextLine();
	            double balance = scanner.nextDouble();
	            double ratePerSecond = scanner.nextDouble();
	            scanner.nextLine(); // Consume newline
	            String circle = scanner.nextLine();
	            sims[i] = new Sim(simId, customerName, balance, ratePerSecond, circle);
	        }

	        String circle1 = scanner.nextLine();
	        String circle2 = scanner.nextLine();

	        // Call transferCircle method and print the result
	        Sim[] result = transferCircle(sims, circle1, circle2);
	        for (Sim sim : result) {
	            System.out.println(sim.getSimId() + " " + sim.getCustomerName() + " " + sim.getCircle() + " " + sim.getRatePerSecond());
	        }

	        scanner.close();
	    }

	    public static Sim[] transferCircle(Sim[] sims, String circle1, String circle2) {
	        Sim[] result = new Sim[sims.length];
	        int count = 0;

	        for (Sim sim : sims) {
	            if (sim.getCircle().equalsIgnoreCase(circle1)) {
	                result[count++] = sim;
	            }
	        }

	        Arrays.sort(result, 0, count, (a, b) -> Double.compare(b.getRatePerSecond(), a.getRatePerSecond()));

	        for (int i = 0; i < count; i++) {
	            result[i].setCircle(circle2);
	        }

	        return Arrays.copyOf(result, count);
	    }
	}


