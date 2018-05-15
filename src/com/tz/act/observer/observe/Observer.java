package com.tz.act.observer.observe;
import com.tz.act.observer.observed.Subject;

public abstract class Observer {
	public abstract void update();
	protected Subject subject;
}
