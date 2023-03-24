package com.progressoft.induction.atm.exceptions;

@SuppressWarnings("serial")
public class AccountNotFoundException extends RuntimeException {

	public AccountNotFoundException() {
		super("ACCOUNT NOT FOUND");
	 
	}
}
