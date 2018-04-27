package com.tz.observer.observe;

import com.tz.observer.observed.Subject;

public class Observer1 extends Observer {

	public Observer1(Subject subject) {
	this.subject=subject;
	subject.attach(this);
	}
	@Override
	public void update() {
	
   System.out.println("观察者1"+subject.getState());
	}

}
