package com.phk;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ICoach coach = context.getBean("myBaseballCoach", ICoach.class);
		System.out.println(coach.getDailyCoaching());
		System.out.println(coach.getDailyFortune());

		context.close();
	}

}
