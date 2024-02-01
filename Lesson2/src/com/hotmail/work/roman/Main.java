package com.hotmail.work.roman;

public class Main {

	public static void main(String[] args) {
		Cat cat1 = new Cat("Barsik", 4, "Black");
		Cat cat2 = new Cat("Umka", 5, "White");

//		System.out.println(cat1);
//		System.out.println(cat2);
		
//		System.out.println(getCatName(cat1));
//		System.out.println(getCatName(cat2));
		
		Cat cat3 = getWhiteCat();
		//System.out.println(cat3);
		
		Cat [] cats = new Cat[] {cat1, cat2, cat3};
		
		for(Cat cat : cats) {
			System.out.println(cat);
		}

	}
	
	public static String getCatName(Cat cat) {
		return cat.getName();
	}
	
	public static Cat getWhiteCat() {
		Cat cat = new Cat("", 0, "white");
		return cat;
	}

}
