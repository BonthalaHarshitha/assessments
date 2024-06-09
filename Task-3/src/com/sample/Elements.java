package com.sample;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Elements {
	

	public class MaxMinElements {
		    public static void main(String[] args) {
		        List<Integer> list = new ArrayList<>();
		        list.add(130);
		        list.add(309);
		        list.add(23);
		        list.add(50);
		        list.add(4900);
		        if (list.isEmpty()) {
		            System.out.println("The list is empty.");
		        } else {
		            int minElement = Collections.min(list);
		            int maxElement = Collections.max(list);  
		            System.out.println("The minimum element in the list is: " + minElement);
		            System.out.println("The maximum element in the list is: " + maxElement);}}
	}
}


