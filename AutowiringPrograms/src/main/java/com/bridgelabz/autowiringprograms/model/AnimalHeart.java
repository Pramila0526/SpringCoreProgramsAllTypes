package com.bridgelabz.autowiringprograms.model;

public class AnimalHeart {
	private String nameOfAnimal;
	private int noOfHearts;

	public String getNameOfAnimal() {
		return nameOfAnimal;
	}

	public void setNameOfAnimal(String nameOfAnimal) {
		this.nameOfAnimal = nameOfAnimal;
	}

	public int getNoOfHearts() {
		return noOfHearts;
	}

	public void setNoOfHearts(int noOfHearts) {
		this.noOfHearts = noOfHearts;
	}

	public void pump() {
		System.out.println("Animal Heart is Pumping....");
		System.out.println("^-^-^-");
	}
}
