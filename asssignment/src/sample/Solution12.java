package sample;

import java.util.Scanner;

public class Solution12 {
	public class Solution {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        NavalVessel[] vessels = new NavalVessel[4];
	        for (int i = 0; i < 4; i++) {
	            int vesselId = Integer.parseInt(scanner.nextLine());
	            String vesselName = scanner.nextLine();
	            int noOfVoyagesPlanned = Integer.parseInt(scanner.nextLine());
	            int noOfVoyagesCompleted = Integer.parseInt(scanner.nextLine());
	            String purpose = scanner.nextLine();
	            vessels[i] = new NavalVessel(vesselId, vesselName, noOfVoyagesPlanned, noOfVoyagesCompleted, purpose);
	        }

	        int percentage = Integer.parseInt(scanner.nextLine());
	        String purpose = scanner.nextLine();

	        int avgVoyages = findAvgVoyagesByPct(vessels, percentage);
	        System.out.println(avgVoyages);

	        NavalVessel foundVessel = findVesselByGrade(vessels, purpose);
	        if (foundVessel != null) {
	            System.out.println(foundVessel.getVesselName() + "%" + foundVessel.getClassification());
	        } else {
	            System.out.println("No Naval Vessel is available with the specified purpose");
	        }

	        scanner.close();
	    }

	    public static int findAvgVoyagesByPct(NavalVessel[] vessels, int percentage) {
	        int sumCompleted = 0;
	        int count = 0;
	        for (NavalVessel vessel : vessels) {
	            double pct = (double) vessel.getNoOfVoyagesCompleted() / vessel.getNoOfVoyagesPlanned() * 100;
	            if (pct >= percentage) {
	                sumCompleted += vessel.getNoOfVoyagesCompleted();
	                count++;
	            }
	        }
	        return count > 0 ? sumCompleted / count : 0;
	    }

	    public static NavalVessel findVesselByGrade(NavalVessel[] vessels, String purpose) {
	        for (NavalVessel vessel : vessels) {
	            if (vessel.getPurpose().equalsIgnoreCase(purpose)) {
	                double pct = (double) vessel.getNoOfVoyagesCompleted() / vessel.getNoOfVoyagesPlanned() * 100;
	                if (pct == 100) {
	                    vessel.setClassification("Star");
	                } else if (pct >= 80) {
	                    vessel.setClassification("Leader");
	                } else if (pct >= 55) {
	                    vessel.setClassification("Inspirer");
	                } else {
	                    vessel.setClassification("Striver");
	                }
	                return vessel;
	            }
	        }
	        return null;
	    }
	}

}


