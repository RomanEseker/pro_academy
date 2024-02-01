package com.hotmail.worl.roman.level_1;

public class Triangle {
	private double sideA;
	private double sideB;
	private double sideC;

	public Triangle(float sideA, float sideB, float sideC) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}

	public double getSideA() {
		return sideA;
	}

	public void setSideA(float sideA) {
		this.sideA = sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public void setSideB(float sideB) {
		this.sideB = sideB;
	}

	public double getSideC() {
		return sideC;
	}

	public void setSideC(float sideC) {
		this.sideC = sideC;
	}
	
	public double returnAreOfTriangle() {
		double perimeter = (this.sideA + this.sideB + this.sideC) / 2;
		return Math.sqrt(perimeter * (perimeter - this.sideA)*(perimeter - this.sideB) * (perimeter - this.sideC));
	}

}
