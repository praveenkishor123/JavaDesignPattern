package com.singletonDP;

public class Satellite {
	
	private static Satellite _instance;
	
	// this will stop using the new operator
	private Satellite() {}
	
	
	// Now we need to give a way to create the instances
	
	// Making the code ready for working in multithreaded environment
	// by adding synchronized.
	
	// Here, by using synchronized keyword, we are also decreasing the
	// performance of our application, as there is always some locking mechanism
	// associate with synchronized.
	public static synchronized Satellite getSatellite() {
		if(_instance == null) {
			_instance = new Satellite();
		}
		
		return _instance;
	}

}
