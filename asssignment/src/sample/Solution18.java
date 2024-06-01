package sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Solution18 {
	    public static Sim2[] matchAndSort(Sim2[] sims, String search_circle, double search_rate) {
	        List<Sim2> resultList = new ArrayList<>();

	        for (Sim2 sim : sims) {
	            if (sim.getCircle().equalsIgnoreCase(search_circle) && sim.getRatePerSecond() < search_rate) {
	                resultList.add(sim);
	            }
	        }

	        Collections.sort(resultList, Comparator.comparing(Sim2::getBalance).reversed());

	        return resultList.toArray(new Sim2[0]);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        Sim2[] sims = new Sim2[4];

	        for (int i = 0; i < 4; i++) {
	            int id = scanner.nextInt();
	            scanner.nextLine();
	            String company = scanner.nextLine();
	            int balance = scanner.nextInt();
	            double ratePerSecond = scanner.nextDouble();
	            scanner.nextLine();
	            String circle = scanner.nextLine();

	            sims[i] = new Sim2(id, company, balance, ratePerSecond, circle);
	        }

	        String search_circle = scanner.nextLine();
	        double search_rate = scanner.nextDouble();

	        Sim2[] result = matchAndSort(sims, search_circle, search_rate);

	        for (Sim2 sim : result) {
	            System.out.println(sim.getId());
	        }
	    }
	


}
