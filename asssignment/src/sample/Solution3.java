package sample;

import java.util.Scanner;

public class Solution3 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        phone[] phones = new phone[4];
	        for (int i = 0; i < 4; i++) {
	            int phoneId = Integer.parseInt(scanner.nextLine());
	            String os = scanner.nextLine();
	            String brand = scanner.nextLine();
	            int price = Integer.parseInt(scanner.nextLine());
	            phones[i] = new phone(phoneId, os, brand, price);
	        }

	        String brand = scanner.nextLine();
	        String os = scanner.nextLine();

	        int totalBrandPrice = findPriceForGivenBrand(phones, brand);
	        if (totalBrandPrice > 0) {
	            System.out.println(totalBrandPrice);
	        } else {
	            System.out.println("The given Brand is not available");
	        }

	        phone phone = getPhoneIdBasedOnOs(phones, os);
	        if (phone != null) {
	            System.out.println(phone.getPhoneId());
	        } else {
	            System.out.println("No phones are available with specified os and price range");
	        }

	        scanner.close();
	    }

	    public static int findPriceForGivenBrand(phone[] phones, String brand) {
	        int totalPrice = 0;
	        for (phone phone : phones) {
	            if (phone.getBrand().equalsIgnoreCase(brand)) {
	                totalPrice += phone.getPrice();
	            }
	        }
	        return totalPrice;
	    }

	    public static phone getPhoneIdBasedOnOs(phone[] phones, String os) {
	        for (phone phone : phones) {
	            if (phone.getOs().equalsIgnoreCase(os) && phone.getPrice() >= 50000) {
	                return phone;
	            }
	        }
	        return null;
	    }
	}



