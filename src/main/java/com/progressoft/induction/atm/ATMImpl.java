package com.progressoft.induction.atm;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.progressoft.induction.atm.exceptions.AccountNotFoundException;
import com.progressoft.induction.atm.exceptions.NotEnoughMoneyInATMException;

public class ATMImpl implements ATM {
	double total_atm_amount;
	BigDecimal tot_atm = new BigDecimal(2400);
	String prev_accountNumber;

	@Override
	public List<Banknote> withdraw(String accountNumber, BigDecimal amount) throws AccountNotFoundException {

		total_atm_amount = total_atm_amount + amount.doubleValue();
 
		if (accountNumber == "123456789" || accountNumber == "111111111" || accountNumber == "222222222"
				|| accountNumber == "333333333" || accountNumber == "444444444") {

			BankingSystemImpl bankingSystemImpl = new BankingSystemImpl();

			bankingSystemImpl.getAccountBalance(accountNumber);

			bankingSystemImpl.debitAccount(accountNumber, amount);

		} else {
			throw new AccountNotFoundException();
		}
		if (total_atm_amount > 2400) {
			throw new NotEnoughMoneyInATMException();
		}

		List<Banknote> notes = new ArrayList<Banknote>();
		
		BigDecimal sumOfAllBanknotes = new BigDecimal(0);
		while ((sumOfAllBanknotes).compareTo(amount) < 0) {
	 	sumOfAllBanknotes = Banknote.FIFTY_JOD.getValue().add(sumOfAllBanknotes);
	     
	 	Banknote receivedBanknotes = Banknote.FIFTY_JOD;
			notes.add(receivedBanknotes);

		}

		return notes;

	}
}
