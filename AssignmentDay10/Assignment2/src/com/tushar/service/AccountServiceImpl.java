package com.tushar.service;

import com.tushar.bean.Account;
import com.tushar.persistence.AccountDao;
import com.tushar.persistence.AccountDaoImpl;

public class AccountServiceImpl implements AccountService{
	
	private AccountDao accountDao = new AccountDaoImpl();

	@Override
	public int checkBalance(int accNo) {
		return accountDao.checkBalance(accNo);
	}

	@Override
	public boolean updateNameByAccountNumber(int accNo, String name) {
		int rows=accountDao.updateNameByAccountName(accNo, name);
		if(rows>0)
			return true;
		return false;
	}

	@Override
	public boolean updateBalance(int accNo, int amount) {
		int rows=accountDao.updateBalance(accNo, amount);
		if(rows>0)
			return true;
		return false;
	}

}
