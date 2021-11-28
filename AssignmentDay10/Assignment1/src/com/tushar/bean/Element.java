package com.tushar.bean;

public class Element {
	private int atomicWeight;
	private String name;
	private String symbol;
	
	public Element() {
		
	}

	public Element(int atomicWeight, String name, String symbol) {
		super();
		this.atomicWeight = atomicWeight;
		this.name = name;
		this.symbol = symbol;
	}


	public int getAtomicWeight() {
		return atomicWeight;
	}

	public void setAtomicWeight(int atomicWeight) {
		this.atomicWeight = atomicWeight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}


	@Override
	public String toString() {
		return "Element [atomicWeight=" + atomicWeight + ", name=" + name + ", symbol=" + symbol + "]";
	}

}
