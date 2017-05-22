package rocketBase;

import static org.junit.Assert.*;

import org.junit.Test;

import exceptions.RateException;

public class rate_test {
	
	@Test
	public void tester() throws RateException{
		
		//test known credit score
		assert RateBLL.getRate(600) == 7;
		///throws exception
		RateBLL.getRate(300);
		
		//test the getPayment method
		double r = 0.04;
		int n = 360;
		double p = 300000.0;
		double f = 0.0;
		boolean t = false;
		assert RateBLL.getPayment(r, n, p, f, t) == 1432.25;
		
	} 
	
	
}
