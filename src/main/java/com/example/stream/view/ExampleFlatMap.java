package com.example.stream.view;

import java.util.List;
import java.util.stream.Collectors;

import com.example.stream.controller.mock.MockAccountController;
import com.example.stream.model.account.Account;

public class ExampleFlatMap {
	public static void run() {
		System.out.println("ExampleFlatMap");

		List<Account> src = MockAccountController.mock();

		List<String> remark = src.stream()
				.flatMap(account -> account.getRemarks() != null ? account.getRemarks().stream() : null)
				.collect(Collectors.toList());
		System.out.println("result");
		remark.stream().forEach(result -> {
			System.out.println(result);
		});
	}
}
