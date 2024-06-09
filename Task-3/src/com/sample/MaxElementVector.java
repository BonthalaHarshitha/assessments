package com.sample;
import java.util.Vector;
import java.util.Collections;

public class MaxElementVector {

		    public static void main(String[] args) {
		        Vector<Integer> vector = new Vector<>();
		        vector.add(0);
		        vector.add(350);
		        vector.add(200);
		        vector.add(50);
		        vector.add(430);
		        if (vector.isEmpty()) {
		            System.out.println("The vector is empty.");
		        } else {
		            int maxElement = Collections.max(vector);
		            System.out.println("The maximum element in the vector is: " + maxElement);}}
		}


