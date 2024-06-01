package sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution7 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        Inventory[] inventories = new Inventory[4];
	        for (int i = 0; i < 4; i++) {
	            String inventoryId = scanner.nextLine();
	            int maximumQuantity = Integer.parseInt(scanner.nextLine());
	            int currentQuantity = Integer.parseInt(scanner.nextLine());
	            int threshold = Integer.parseInt(scanner.nextLine());
	            inventories[i] = new Inventory(inventoryId, maximumQuantity, currentQuantity, threshold);
	        }

	        int limit = Integer.parseInt(scanner.nextLine());

	        Inventory[] result = replenish(inventories, limit);

	        for (Inventory inventory : result) {
	            System.out.print(inventory.getInventoryId() + " ");
	            if (inventory.getThreshold() > 75) {
	                System.out.println("Critical Filling");
	            } else if (inventory.getThreshold() >= 50) {
	                System.out.println("Moderate Filling");
	            } else {
	                System.out.println("Non-Critical Filling");
	            }
	        }

	        scanner.close();
	    }

	    public static Inventory[] replenish(Inventory[] inventories, int limit) {
	        List<Inventory> result = new ArrayList<>();
	        for (Inventory inventory : inventories) {
	            if (inventory.getThreshold() <= limit) {
	                result.add(inventory);
	            }
	        }
	        return result.toArray(new Inventory[0]);
	    }
	}
