package com.phk;

public class TrackCoach implements ICoach {

	private IFortuneService _fortuneService;
	
	private String _name;
	
	public TrackCoach() {

	}
	
	public void setFortuneService(IFortuneService fortuneService) {
		this._fortuneService = fortuneService;
	}

	public void setName(String name) {
		this._name = name;
	}
	
	public String getName() {
		return this._name;
	}
	
	@Override
	public String getDailyCoaching() {
		return "This is Track Coach";
	}

	@Override
	public String getDailyFortune() {
		return _fortuneService.getFortune();
	}

}
