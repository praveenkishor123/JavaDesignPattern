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
	
	// Whenever a thread is accessing getSatellite() method, the accessing thread
	// will have to always obtain the lock from the Satellite class.
	
	// Until one thread releases the lock, other threads have to wait.
	public static synchronized Satellite getSatellite() {
		if(_instance == null) {
			_instance = new Satellite();
		}
		
		return _instance;
	}

}
