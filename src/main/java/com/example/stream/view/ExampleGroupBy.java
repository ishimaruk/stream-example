package com.example.stream.view;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.example.stream.controller.mock.MockAccountController;
import com.example.stream.model.account.Account;

public class ExampleGroupBy {
	public static void run() {
		System.out.println("ExampleGroupBy");

		List<Account> src = MockAccountController.mock();
		System.out.println("before groupBy");
		src.stream().forEach(result -> {
			System.out.println(result);
		});

		Map<BigDecimal, List<Account>> result = src.stream().collect(Collectors.groupingBy(Account::getBalance));
		System.out.println("after groupBy");
		result.entrySet().stream().forEach(map -> {
			System.out.println("key : " + map.getKey());
			System.out.println("value : ");
			map.getValue().stream().forEach(val -> {
				System.out.println(val);
			});
		});
	}
}
