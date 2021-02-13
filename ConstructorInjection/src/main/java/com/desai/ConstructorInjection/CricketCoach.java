package com.desai.ConstructorInjection;

public class CricketCoach implements Coach{
	private FortuneService fortuneService;
	
	public CricketCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	public void getDailyWorkOut() {
		System.out.println("Cricket coach");
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
