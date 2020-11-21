package com.example.stream.view;

import java.util.List;
import java.util.stream.Collectors;

import com.example.stream.controller.mock.MockAccountController;
import com.example.stream.model.account.Account;

public class ExampleMap {
	public static void run() {
		System.out.println("ExampleMap");

		List<Account> src = MockAccountController.mock();

		// lamda method
		List<String> lamdaResult = src.stream().map(account -> account.getAccountName()).collect(Collectors.toList());
		System.out.println("lamda method result");
		lamdaResult.stream().forEach(result -> {
			System.out.println(result);
		});

		// method reference
		List<String> methodRefResult = src.stream().map(Account::getAccountName).collect(Collectors.toList());
		System.out.println("method reference");
		methodRefResult.stream().forEach(result -> {
			System.out.println(result);
		});
	}
}
