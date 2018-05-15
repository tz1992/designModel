package com.tz.act.observer;

import com.tz.act.observer.observe.Observe2;
import com.tz.act.observer.observe.Observer1;
import com.tz.act.observer.observed.Subject;

public class ObserverTest {
public static void main(String[] args) {
	Subject subject=new Subject();
	new Observer1(subject);
	new Observe2(subject);
	System.out.println("第一次改");
	subject.setState(78);
	System.out.println("第二次该");
	subject.setState(45);
}
}
