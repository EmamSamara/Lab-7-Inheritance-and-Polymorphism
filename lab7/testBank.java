package lab7;

public class testBank {

	public static void main(String[] args) {

		Account arr[]=new Account[3];
		arr[0]=new Checking(1,500);
		arr[1]=new Account(2,1500);
		arr[2]=new Svaings(3,1200);
		
		arr[0].deposit(0);
		System.out.println(arr[0].toString());
		((Checking) arr[0]).withdraw2(900);
		System.out.println(arr[0].toString());
		System.out.println();

		
		arr[1].deposit(2);
		System.out.println(arr[1].toString());
		arr[1].withdraw(300);
		System.out.println(arr[1].toString());
		System.out.println();

		
		arr[2].deposit(300);
		System.out.println(arr[2].toString());
		((Svaings) arr[0]).withdraw1(900);
		System.out.println(arr[2].toString());

		
	}

}
