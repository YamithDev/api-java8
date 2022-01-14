package com.yamidev.java8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaApp {
	
	public void order() {
		List<String> family = new ArrayList<>();
		family.add("Yamid");
		family.add("Julieta");
		family.add("Keita");

		Collections.sort(family, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});

		family.sort(Comparator.naturalOrder());
		
		for(String member: family) {
			System.out.println(member);
		}
	}
	
	public void calculate() {
		Operation operation = (a, b) -> (a + b) / 2;
		System.out.println("Average = " + operation.calculateAverage(10, 20));
	}
	
	public static void main(String[] args) {
		LambdaApp lambda = new LambdaApp();
		lambda.order();
		lambda.calculate();
	}
}
