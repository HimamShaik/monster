package com.technoelevate.loosecoupling;

public class Mytravel implements ITravel {

	public Travel travel;

	public Mytravel(Travel travel) {
		this.travel = travel;
	}

	@Override
	public void start() {
		travel.Start();
	}

}
