package com.phk;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScopeApplicationContext.xml");
		
		BaseballCoach coach1 = context.getBean("myBaseballCoach", BaseballCoach.class);
		BaseballCoach coach2 = context.getBean("myBaseballCoach", BaseballCoach.class);
		
		Boolean isEqualResult = (coach1 == coach2);
		System.out.println("Is equal result: " + isEqualResult);
		
		coach1.getDailyCoaching();
		coach2.getDailyFortune();

		context.close();
	}

}
