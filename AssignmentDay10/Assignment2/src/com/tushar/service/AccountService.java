package com.tushar.service;

import com.tushar.bean.Account;

public interface AccountService {

	public int checkBalance(int accNo);

	public boolean updateNameByAccountNumber(int accNo, String name);

	public boolean updateBalance(int accNo, int amount);

}
