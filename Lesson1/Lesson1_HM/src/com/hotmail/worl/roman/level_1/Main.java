package com.hotmail.worl.roman.level_1;

import java.util.Formatter;


public class Main {

	public static void main(String[] args) {

		// Products
		Product prod1 = new Product(18000, "Smasung A50", 0.708);
		Product prod2 = new Product(20000, "iPhone XR", 0.705);

		System.out.println("Name product: " + prod1.getDescription() + " price: " + prod1.getPrice() + " weight: "
				+ prod1.getWeight());
		System.out.println("Name product: " + prod2.getDescription() + " price: " + prod2.getPrice() + " weight: "
				+ prod2.getWeight());

		prod1.setDescription(prod1.getDescription() + " б/y");
		prod2.setDescription(prod2.getDescription() + " б/y");

		System.out.println(prod1.toString());
		System.out.println(prod2.toString());
		
		//Triangle
		Triangle triangle1 = new Triangle(3	, 4, 5);
		Triangle triangle2 = new Triangle(6	, 8, 10);
		Triangle triangle3 = new Triangle(9	, 11, 8);
		
		
		
		Triangle [] prodArray = new Triangle[] {triangle1, triangle2, triangle3};
		
		for(Triangle product : prodArray) {
			Formatter fortm = new Formatter();
			System.out.println(fortm.format("%.2f", product.returnAreOfTriangle()));
			fortm.close();
		}
	}

}
