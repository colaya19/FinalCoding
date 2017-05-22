package rocketBase;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import rocketDomain.RateDomainModel;


public class Rate_Test {

	 
	RateDomainModel RDM = new RateDomainModel();
	
	@Test
	public void testCreditScore(){
		
		//Test known credit score and return known interest rate
		RDM.setiMinCreditScore(650);
		assert RDM.getdInterestRate() ==6.5;
		
		
		//check if RateException is thrown
		RDM.setiMinCreditScore(300);
		RDM.getdInterestRate();
		
	}
	
	//TODO - RocketDAL rate_test
	//		Check to see if a RateException is thrown if there are no rates for a given
	//		credit score

	
	
}
