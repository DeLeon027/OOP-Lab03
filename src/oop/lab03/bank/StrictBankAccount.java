package oop.lab03.bank;

import oop.lab03.bank.interfaces.BankAccount;

public class StrictBankAccount implements BankAccount{

	private static final double ATM_TRANSACTION_FEE = 1;
	private static final double MANAGEMENT_FEE = 5;
	private static final double TRANSACTION_FEE = 0.1;
	
	private final int usrID;
	private double balance;
	private int nTransactions;
	
	public StrictBankAccount(final int usrID, final double balance) {
	    this.usrID = usrID;
	    this.balance = balance;
	}

	
	public void withdraw(int usrID, double amount) {
		
	}

	
	public void deposit(int usrID, double amount) {
		// TODO Auto-generated method stub
		
	}

	
	public void depositFromATM(int usrID, double amount) {
		// TODO Auto-generated method stub
		
	}

	
	public void withdrawFromATM(int usrID, double amount) {
		// TODO Auto-generated method stub
		
	}

	
	public void chargeManagementFees(int usrID) {
		// TODO Auto-generated method stub
		
	}

	
	public double getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public int getTransactionsCount() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	private boolean checkUser(final int id) {
        return this.getUserID() == id;
    }


	public int getUserID() {
		return usrID;
	}

}
