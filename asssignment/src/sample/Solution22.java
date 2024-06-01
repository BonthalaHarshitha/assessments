package sample;

import java.util.Scanner;

public class Solution22 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Read the number of agencies
	        int n = scanner.nextInt();
	        scanner.nextLine(); // Consume newline

	        // Create an array to store TravelAgencies objects
	        TravelAgencies[] agencies = new TravelAgencies[n];

	        for (int i = 0; i < n; i++) {
	            int regNo = scanner.nextInt();
	            scanner.nextLine(); // Consume newline
	            String agencyName = scanner.nextLine();
	            String packageType = scanner.nextLine();
	            int price = scanner.nextInt();
	            boolean flightFacility = scanner.nextBoolean();

	            agencies[i] = new TravelAgencies(regNo, agencyName, packageType, price, flightFacility);
	        }

	        System.out.println(findAgencyWithHighestPackagePrice(agencies));
	        agencyDetailsforGivenIdAndType(agencies, scanner.nextInt(), scanner.next());

	        scanner.close();
	    }

	    public static int findAgencyWithHighestPackagePrice(TravelAgencies[] agencies) {
	        int highestPackagePrice = 0;
	        for (TravelAgencies agency : agencies) {
	            highestPackagePrice = Math.max(highestPackagePrice, agency.getPrice());
	        }
	        return highestPackagePrice;
	    }

	    public static void agencyDetailsforGivenIdAndType(TravelAgencies[] agencies, int regNo, String packageType) {
	        for (TravelAgencies agency : agencies) {
	            if (agency.getRegNo() == regNo && agency.getPackageType().equalsIgnoreCase(packageType) && agency.isFlightFacility()) {
	                System.out.println(agency.getAgencyName() + ":" + agency.getPrice());
	                return;
	            }
	        }
	        System.out.println("No Travel Agency is available with the specified ID and package type.");
	    }
	

}


