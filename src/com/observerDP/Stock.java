package com.observerDP;

import java.util.ArrayList;
import java.util.List;

public abstract class Stock implements Observable {
	
	private List<Observer> observers;
	
	public Stock() {
		observers = new ArrayList<Observer>();
	}
	
	private String name;
	private int price;
	
	

}
