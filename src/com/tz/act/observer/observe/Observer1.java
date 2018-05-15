package com.tz.act.observer.observe;

import com.tz.act.observer.observed.Subject;

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
