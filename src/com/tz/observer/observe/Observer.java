package com.tz.observer.observe;
/*
 * 观察者
 */
import com.tz.observer.observed.Subject;

public abstract class Observer {
	public abstract void update();
	protected Subject subject;
}
