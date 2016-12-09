package com.singletonDP;

public class Satellite {
	
	private static Satellite _instance;
	
	// this will stop using the new operator
	private Satellite() {}
	
	
	// Now we need to give a way to create the instances
	public static Satellite getSatellite() {
		if(_instance == null) {
			_instance = new Satellite();
		}
		
		return _instance;
	}

}
