package com.tz.act.observer.observe;

import com.tz.act.observer.observed.Subject;

public class Observe2 extends Observer {
   public Observe2(Subject subject) {
		this.subject=subject;
		subject.attach(this);
	}
	@Override
	public void update() {
		System.out.println("观察者2"+this.subject.getState());

	}

}
