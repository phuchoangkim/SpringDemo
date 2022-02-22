package com.phk;

public class BaseballCoach implements ICoach {

	private IFortuneService _fortuneService;

	public BaseballCoach() {

	}

	public BaseballCoach(IFortuneService fortuneService) {
		this._fortuneService = fortuneService;
	}

	@Override
	public String getDailyCoaching() {
		return "This is Baseball Coach";
	}

	@Override
	public String getDailyFortune() {
		return _fortuneService.getFortune();
	}
	
	public void init() {
		System.out.println("Init Baseball Coach");
	}
	
	public void destroy() {
		System.out.println("Destroy Baseball Coach");
	}

}
