package lab7;

public class Checking extends Account{
	
	
	
	private int overDraftLimit =1000;

public Checking(int id, double balance) {
		super(id, balance);
	}


public double withdraw2(double amount) {
	
if(amount<=overDraftLimit) {
	setBalance(getBalance()-amount);
	return balance;
}
	
else {
	System.out.println("the amount you entered is more than the overDaraftLimit");
	return balance;
}
	
	
	
}

	
	
	
	

}
