package exceptions;

import rocketDomain.RateDomainModel;

public class RateException extends Exception {
	
	private RateDomainModel RateDomainModel;
	
	public RateException(RateDomainModel RateDomainModel)
	{
		this.RateDomainModel = RateDomainModel;
	}
	
	public RateDomainModel getModel()
	{
		return RateDomainModel;
	}
	
}

