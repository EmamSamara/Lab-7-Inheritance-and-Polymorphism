package lab7;

public class Svaings extends Account{

	public Svaings(int id, double balance) {
		super(id, balance);

	}
	
	public double withdraw(double amount) {
		if(amount<=balance) {
			setBalance(getBalance()-amount);
			return balance;
		}else {
			System.out.println("no enough money in your account");
			return balance;
		}
	}
	
	
	
	
	

}
