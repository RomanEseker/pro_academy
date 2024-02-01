package com.hotmail.work.roman;

public class Cat {
	private String name;
	private String color;
	private int weight;
	
	public Cat(String name, int weight, String color) {
		this.name = name;
		this.weight = weight;
		this.color = color;
	}
	
	public void setName(String name) {
		name = this.name;
	}
	
	public void setWeight(int weight) {
		weight = this.weight;
	}
	
	public void setColor(String color) {
		color = this.color;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getWeight() {
		return this.weight;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public String meow() {
		return "meow meow";
	}
	
	public void jump() {
		System.out.println("hop");
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", weight=" + weight + ", color=" + color + "]";
	}
	
	

}
 