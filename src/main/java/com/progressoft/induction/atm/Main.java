package com.progressoft.induction.atm;

import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {

		/*
		 * System.out.println("Enter the account number:");
		 * 
		 * Scanner scan1 = new Scanner(System.in); String AccNo = scan1.next();
		 * 
		 * 
		 * System.out.println("Enter the amount to withdraw :"); Scanner scan = new
		 * Scanner(System.in); BigDecimal InputAmount = scan.nextBigDecimal();
		 */

		ATMImpl atmImpl = new ATMImpl();
		atmImpl.withdraw("123456789", new BigDecimal("200"));

		/*
		 * scan1.close(); scan.close();
		 */

	}

}
