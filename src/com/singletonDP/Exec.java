package com.singletonDP;

public class Exec {
	
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			
		//	Satellite s = new Satellite();
			
			System.out.println(Satellite.getSatellite().hashCode());
			
		}
	}

}
