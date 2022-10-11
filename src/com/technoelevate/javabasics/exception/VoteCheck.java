package com.technoelevate.javabasics.exception;

public class VoteCheck {
	public void vote(int age) throws IneligibleException {
		if(age>=18) {
			System.out.println("you can caste the vote");
		}
		else {
			throw new IneligibleException("Ineligible for vote");
		}
	}

}
