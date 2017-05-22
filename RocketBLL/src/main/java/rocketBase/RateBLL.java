package rocketBase;

import java.util.ArrayList;

import org.apache.poi.ss.formula.functions.*;

import exceptions.RateException;
import rocketDomain.RateDomainModel;

public class RateBLL {

	private static RateDAL _RateDAL = new RateDAL();
	
	public static double getRate(int GivenCreditScore) throws RateException 
	{
		double dInterestRate = 0;
		
		try{
		 
			ArrayList<RateDomainModel> rates = RateDAL.getAllRates();
		
			for (RateDomainModel x : rates) {

				if (GivenCreditScore == x.getiMinCreditScore()) {

					dInterestRate = x.getdInterestRate();
				}

				else if (dInterestRate == 0) {
					throw new RateException(x);
				}
			}
		}
		
		catch (RateException lsdf){
			System.out.println("Credit Score doesn't exist");
		}
		
		return dInterestRate;
		
		
	}
	
	
	
	
	
	
	
	//TODO - RocketBLL RateBLL.getPayment 
	//		how to use:
	//		https://poi.apache.org/apidocs/org/apache/poi/ss/formula/functions/FinanceLib.html
	
	public static double getPayment(double r, double n, double p, double f, boolean t)
	{		
		return FinanceLib.pmt(r, n, p, f, t);
	}
}
