package com.desai.ConstructorInjection;

public class BaseballCoach implements Coach{
	private FortuneService fortuneService;
	
	
	public BaseballCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	public void getDailyWorkOut() {
		System.out.println("Base ball coach");
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
