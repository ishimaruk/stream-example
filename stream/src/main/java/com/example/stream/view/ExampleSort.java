package com.example.stream.view;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.example.stream.controller.mock.MockAccountController;
import com.example.stream.model.account.Account;

public class ExampleSort {
	private static Comparator<Account> ORDER_BY = Comparator.comparing(Account::getBalance).reversed()
			.thenComparing(Account::getAccountName);

	private static Comparator<Account> methodComparator = new Comparator<Account>() {
		@Override
		public int compare(Account l, Account r) {
			int compare1 = l.getBalance().compareTo(r.getBalance());
			if (compare1 == 0) {
				return -1 * (l.getAccountName().compareTo(r.getAccountName()));
			}
			return compare1;
		}
	};

	public static void run() {
		System.out.println("ExampleSort");
		List<Account> src = MockAccountController.mock();

		System.out.println("before sort");
		src.stream().forEach(result -> {
			System.out.println("name : " + result.getAccountName() + ", balance : " + result.getBalance());
		});

		List<Account> resultC = src.stream().sorted(ORDER_BY).collect(Collectors.toList());
		System.out.println("after sort with Comparator");
		resultC.stream().forEach(account -> {
			System.out.println("name : " + account.getAccountName() + ", balance : " + account.getBalance());
		});

		List<Account> resultM = src.stream().sorted(methodComparator).collect(Collectors.toList());
		System.out.println("after sort with Method");
		resultM.stream().forEach(account -> {
			System.out.println("name : " + account.getAccountName() + ", balance : " + account.getBalance());
		});

	}

}
