package com.tz.observer.observed;

import java.util.ArrayList;

import com.tz.observer.observe.Observer;

/*
 * 被观察的
 */
public class Subject {
private ArrayList<Observer>list=new ArrayList<>();
private int state;
public int getState(){
	return state;
}
public void setState(int state){
	this.state=state;
	notifyAllObserver();
}

public void attach(Observer observer){
	list.add(observer);
}

public void notifyAllObserver(){
	for(Observer observer:list){
		observer.update();
	}
}
}
