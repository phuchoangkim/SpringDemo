package com.phk;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemoApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifecycleApplicationContext.xml");

		BaseballCoach coach = context.getBean("myBaseballCoach", BaseballCoach.class);

		System.out.println(coach.getDailyCoaching());

		context.close();
	}
}
