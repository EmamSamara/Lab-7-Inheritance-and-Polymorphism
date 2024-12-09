package lab7;

import java.util.Date;


public class Account {
	protected int id=0;
protected double balance=0;
private Date dataCreated;
	
	
	public Account(Date dataCreated) {
		this.dataCreated=dataCreated;
	}
	
	
	public Account(int id , double balance) {
		this.balance=balance;
		this.id=id;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public Date getDataCreated() {
		return dataCreated;
	}
	

public double withdraw(double amount) {
	if(this.getBalance()>amount) {
		
	this.balance=(getBalance()-amount);
	System.out.println("the Balance have been changed");
	return balance;
	
	}else {
		System.out.println("the balance is smaller than the amount");
	return balance;
	}
}

	
	
	
	public double deposit(double amount) {
		this.balance=(balance+amount);
		System.out.println("deposit went successfully");
		return balance;
	}


	@Override
	public String toString() {
		return "Account [id=" + id + ", balance=" + balance + ", dataCreated=" + dataCreated + "]";
	}



	
	
	
	
	
	
	
}
