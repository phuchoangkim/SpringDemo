package com.phk;

public class TrackCoach implements ICoach {

	private IFortuneService fortuneService;

	public TrackCoach() {

	}
	
	public void setFortuneService(IFortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyCoaching() {
		return "This is Track Coach";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
