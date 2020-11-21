package com.example.stream.controller.mock;

import java.math.BigDecimal;
import java.util.List;

import com.example.stream.model.account.Account;

public class MockAccountController {

	public static List<Account> mock() {
		Account a1 = new Account("Mock account 1", "000100", BigDecimal.ONE, List.of("remark 11", "remark 12"));
		Account a2 = new Account("Mock account 2", "000020", BigDecimal.TEN, null);
		Account a3 = new Account("Mock account 3", "000003", BigDecimal.ONE, List.of("remark 3"));
		return List.of(a1, a2, a3);
	}
}
