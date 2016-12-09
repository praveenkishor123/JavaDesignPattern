package com.observerDP;

public interface Observable {
	
	public void registerObserver(Observer observer);
	
	public void notifyObservers();
	
	public void removeObserver(Observer observer);

}
