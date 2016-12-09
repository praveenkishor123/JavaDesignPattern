package com.proxyDP;

public class Vodafone implements ISP {
	
	@Override
	public String getResource(String site) {
	switch (site) {
	case "www.google.com":
		return "GOOOOOOOOOOOOOOOGLE";
	case "www.yahoo.com":
		return "Yahooooooooooooo";
	default:
		return "Sorry no resource found";
	}

	}


}
