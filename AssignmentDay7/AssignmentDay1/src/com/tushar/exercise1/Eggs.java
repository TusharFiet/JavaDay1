package com.tushar.exercise1;

public class Eggs {
	private int totalEggs, grossEgg, dozenEgg, remainingEgg;
		
	public void setTotalEggs(int totalEggs) {
		this.totalEggs = totalEggs;
	}

	public int getGrossEgg() {
		return grossEgg;
	}

	public int getDozenEgg() {
		return dozenEgg;
	}

	public int getRemainingEgg() {
		return remainingEgg;
	}
	
	public void getCalculate() {
		calculateEggs();
	}

	private void calculateEggs() {
		grossEgg = totalEggs/144;
		totalEggs %= 144;
		dozenEgg = totalEggs/12;
		totalEggs %= 12;
		remainingEgg = totalEggs;
	}
}
