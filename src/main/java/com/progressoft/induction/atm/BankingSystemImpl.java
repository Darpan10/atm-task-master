package com.progressoft.induction.atm;

import java.math.BigDecimal;

import com.progressoft.induction.atm.BankingSystem;
import com.progressoft.induction.atm.exceptions.InsufficientFundsException;

public class BankingSystemImpl implements BankingSystem {
	static BigDecimal balance = new BigDecimal(1000);

	BigDecimal balance_whenDifferentAccount = new BigDecimal(1000);
	BigDecimal RemainAmount = new BigDecimal(0);
	static String previous_accNo = "";

	@Override
	public BigDecimal getAccountBalance(String accountNumber) {

		return balance;
	}

	@Override
	public void debitAccount(String accountNumber, BigDecimal amount) throws InsufficientFundsException {

		if (previous_accNo == accountNumber || previous_accNo == "") {

			RemainAmount = balance.subtract(amount);

			if (RemainAmount.compareTo(BigDecimal.ZERO) < 0) {
				throw new InsufficientFundsException();
			} else {
				balance = RemainAmount;
			}

		}

		else if (previous_accNo != accountNumber && previous_accNo != "") {
			RemainAmount = balance_whenDifferentAccount.subtract(amount);

			if (RemainAmount.compareTo(BigDecimal.ZERO) < 0) {
				throw new InsufficientFundsException();
			} else {
				balance_whenDifferentAccount = RemainAmount;
				balance = balance_whenDifferentAccount;

			}

		}

		previous_accNo = accountNumber;
	}

}
