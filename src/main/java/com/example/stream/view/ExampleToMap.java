package com.example.stream.view;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.example.stream.controller.mock.MockAccountController;
import com.example.stream.model.account.Account;

public class ExampleToMap {
	public static void run() {
		System.out.println("ExampleToMap");
		List<Account> src = MockAccountController.mock();

		Map<String, BigDecimal> result = src.stream()
				.collect(Collectors.toMap(Account::getAccountName, Account::getBalance));
		result.entrySet().stream().forEach(map -> {
			System.out.println("key :" + map.getKey() + ", value :" + map.getValue().toPlainString());
		});

	}
}
