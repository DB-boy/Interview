package com.gin.pattern.observer;

public class ConcreteObserver implements Observer {

	@Override
	public void update(String str) {
			System.out.println(this+": Str: "+str);

	}

}
