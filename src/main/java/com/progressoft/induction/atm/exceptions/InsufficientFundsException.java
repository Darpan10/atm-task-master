package com.progressoft.induction.atm.exceptions;

@SuppressWarnings("serial")
public class InsufficientFundsException extends RuntimeException{
	
    public InsufficientFundsException() {
        super("INSUFFICIENT FUNDS IN THE ACCOUNT");
    }	
	
}
