package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution9 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        Medicine[] medicines = new Medicine[4];
	        for (int i = 0; i < 4; i++) {
	            String medicineName = scanner.nextLine();
	            String batch = scanner.nextLine();
	            String disease = scanner.nextLine();
	            int price = Integer.parseInt(scanner.nextLine());
	            medicines[i] = new Medicine(medicineName, batch, disease, price);
	        }

	        String disease = scanner.nextLine();
	        Integer[] prices = getPriceByDisease(medicines, disease);

	        for (int price : prices) {
	            System.out.println(price);
	        }

	        scanner.close();
	    }

	    public static Integer[] getPriceByDisease(Medicine[] medicines, String disease) {
	        List<Integer> priceList = new ArrayList<>();
	        for (Medicine medicine : medicines) {
	            if (medicine.getDisease().equalsIgnoreCase(disease)) {
	                priceList.add(medicine.getPrice());
	            }
	        }

	        Integer[] priceArray = priceList.toArray(new Integer[0]);
	        Arrays.sort(priceArray);
	        return priceArray;
	    }
	

}



