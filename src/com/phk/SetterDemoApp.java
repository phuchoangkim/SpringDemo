package com.phk;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		TrackCoach coach = context.getBean("myTrackCoach", TrackCoach.class);

		System.out.println(coach.getDailyCoaching());
		System.out.println(coach.getDailyFortune());
		System.out.println(coach.getName());
		context.close();
	}
}
