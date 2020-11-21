package com.example.stream.model.account;

import java.math.BigDecimal;
import java.util.List;

public class Account {
	private String accountName;
	private String accountNo;
	private BigDecimal balance;
	private List<String> remarks;

	public Account() {
		super();
	}

	public Account(String accountName, String accountNo, BigDecimal balance, List<String> remarks) {
		super();
		this.accountName = accountName;
		this.accountNo = accountNo;
		this.balance = balance;
		this.remarks = remarks;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public List<String> getRemarks() {
		return remarks;
	}

	public void setRemarks(List<String> remarks) {
		this.remarks = remarks;
	}

}
