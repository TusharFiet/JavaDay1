package com.tushar.persistence;

import com.tushar.bean.Account;

public interface AccountDao {

	public int checkBalance(int accNo);

	public int updateNameByAccountName(int accNo, String name);

	public int updateBalance(int accNo, int amount);


}
