package com.vcube.model;

public class BankAccount {
	private long accountNumber;
	private String name;
	private String email;
	private long amount;

	public BankAccount() {

	}

	public BankAccount(long accountNumber, String name, String email, long amount) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.email = email;
		this.amount = amount;

	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", name=" + name + ", email=" + email + ", amount="
				+ amount + "]";
	}

}
