package com.example.stream.view;

import java.util.List;
import java.util.stream.Collectors;

import com.example.stream.controller.mock.MockAccountController;
import com.example.stream.model.account.Account;

public class ExampleFilter {
	public static void run() {
		System.out.println("ExampleFilter");
		List<Account> src = MockAccountController.mock();

		System.out.println("before filter");
		src.stream().forEach(result -> {
			System.out.println(result.getAccountName());
		});

		List<Account> result = src.stream().filter(account -> !account.getAccountNo().equalsIgnoreCase("000020"))
				.collect(Collectors.toList());
		System.out.println("after filter");
		result.stream().forEach(account -> {
			System.out.println(account.getAccountName());
		});

	}
}
