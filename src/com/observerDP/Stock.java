package com.observerDP;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Stock implements Observable {
	
	private List<Observer> observers;
	
	public Stock() {
		observers = new ArrayList<Observer>();
	}
	
	private String name;
	private int price;
	
	public String getStockName() {
		return name;
	}
	
	@Override
	public void registerObserver(Observer observer) {
		if(observer != null) {
			this.observers.add(observer);
		}
	}
	
	@Override
	public void notifyObservers() {
		Iterator<Observer> it = observers.iterator();
	}

}
