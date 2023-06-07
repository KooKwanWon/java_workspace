package com.kh.map.model;

public class Snack {

	private String flavor;
	private int Calorie;
	public Snack() {
	}
	public Snack(String flavor, int calorie) {
		this.flavor = flavor;
		Calorie = calorie;
	}
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public int getCalorie() {
		return Calorie;
	}
	public void setCalorie(int calorie) {
		Calorie = calorie;
	}
	@Override
	public String toString() {
		return "Snack [flavor=" + flavor + ", Calorie=" + Calorie + "]";
	}
	
	
	
}
