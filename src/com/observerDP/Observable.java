package com.observerDP;

public interface Observable {
	
	// This will register all the observers.
	public void registerObserver(Observer observer);
	
	public void notifyObservers();
	
	public void removeObserver(Observer observer);

}
