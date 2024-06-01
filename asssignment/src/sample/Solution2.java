package sample;
import java.util.Scanner;

public class Solution2 {
	public static int findTestPassedByEnv(AutonomusCar[] cars, String environment) {
		int totalTestsPassed = 0;
	    boolean found = false;

	        for (AutonomusCar car : cars) {
	            if (car.getEnvironment().equalsIgnoreCase(environment)) {
	                totalTestsPassed += car.getNoOfTestsPassed();
	                found = true;
	            }
	        }

	        if (found) {
	            return totalTestsPassed;
	        } else {
	            return 0;
	        }
	    }

	    public static AutonomusCar updateCarGrade(AutonomusCar[] cars, String brand) {
	        for (AutonomusCar car : cars) {
	            if (car.getBrand().equalsIgnoreCase(brand)) {
	                int rating = (car.getNoOfTestsPassed() * 100) / car.getNoOfTestsConducted();
	                if (rating >= 80) {
	                    car.setGrade("A1");
	                } else {
	                    car.setGrade("B2");
	                }
	                return car;
	            }
	        }
	        return null;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        AutonomusCar[] cars = new AutonomusCar[4];

	        for (int i = 0; i < cars.length; i++) {
	            int carId = scanner.nextInt();
	            scanner.nextLine();
	            String brand = scanner.nextLine();
	            int noOfTestsConducted = scanner.nextInt();
	            int noOfTestsPassed = scanner.nextInt();
	            scanner.nextLine();
	            String environment = scanner.nextLine();

	            cars[i] = new AutonomusCar(carId, brand, noOfTestsConducted, noOfTestsPassed, environment);
	        }

	        String environment = scanner.nextLine();
	        String brand = scanner.nextLine();

	        int totalTestsPassed = findTestPassedByEnv(cars, environment);
	        if (totalTestsPassed > 0) {
	            System.out.println(totalTestsPassed);
	        } else {
	            System.out.println("There are no tests passed in this particular environment");
	        }

	        AutonomusCar carWithUpdatedGrade = updateCarGrade(cars, brand);
	        if (carWithUpdatedGrade != null) {
	            System.out.println(carWithUpdatedGrade.getBrand() + "::" + carWithUpdatedGrade.getGrade());
	        } else {
	            System.out.println("No Car is available with the specified brand");
	        }

	        scanner.close();
	    }
	}

