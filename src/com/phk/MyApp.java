package com.phk;

public class MyApp {

	public static void main(String[] args) {
		ICoach baseballCoach = new TrackCoach();
		String coaching = baseballCoach.getDailyCoaching();
		System.out.println(coaching);
	}

}
