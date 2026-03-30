package com.mod3.app;

import java.util.*;

public class BankAccount {
  // Your variable declarations and code here
  private int funds;
  private static int _id;
  private int accountNumber;
  private static List<BankAccount> bankAccounts = new ArrayList<>();

  BankAccount(int money) {
    this.funds = money;
    accountNumber = _id++;
    bankAccounts.add(this);
  }

  public void deposit(int money) {
    this.funds += money;
  }

  public void withdraw(int money) {
    this.funds -= money;
  }

  public int getAccountNumber() {
    return accountNumber;
  }

  public int getBalance() {
    return funds;
  }

  public static int getTotalAccounts() {
    return bankAccounts.size();
  }

  public static void main(String[] args) {
    BankAccount account1 = new BankAccount(1000);
    BankAccount account2 = new BankAccount(2000);

    account1.deposit(500);
    account2.withdraw(800);

    System.out.println("Account " + account1.getAccountNumber() + " balance: " + account1.getBalance());
    System.out.println("Account " + account2.getAccountNumber() + " balance: " + account2.getBalance());

    System.out.println("Total number of accounts: " + BankAccount.getTotalAccounts());
  }
}
