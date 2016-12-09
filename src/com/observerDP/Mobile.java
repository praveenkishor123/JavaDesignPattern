package com.observerDP;

public class Mobile implements Observer {

	@Override
	public void update(Stock stock) {
		// TODO Auto-generated method stub
	
		System.out.println(stock.getStockName() + stock.getStockPrice());
	}
	
	

}
