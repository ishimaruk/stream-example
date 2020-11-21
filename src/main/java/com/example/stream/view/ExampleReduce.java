package com.example.stream.view;

import java.math.BigDecimal;
import java.util.List;

import com.example.stream.controller.mock.MockAccountController;
import com.example.stream.model.account.Account;

public class ExampleReduce {
	public static void run() {
		System.out.println("ExampleReduce");
		List<Account> src = MockAccountController.mock();

		src.stream().forEach(result -> {
			System.out.println(result.getAccountName() + " : " + result.getBalance().toPlainString());
		});

		BigDecimal result = src.stream().map(Account::getBalance).reduce(BigDecimal.ZERO, BigDecimal::add);
		System.out.println("after reduce : " + result.toPlainString());

	}
}
