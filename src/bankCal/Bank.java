package bankCal;

public class Bank {
	
	int acc_no;
	String name;
	float amount;
	
	//method to initialize object
	
	void insert(int a , String n, float amt) {
		acc_no=a;
		name=n;
		amount=amt;
	}
	
	//deposit method
	void deposit(float amt) {
		amount=amount+amt;
		System.out.println(amt+"deposit");
	}

	
	//withdraw
	
	void withdraw(float amt) {
		if(amount>amt) {
			System.out.print("insufficient balance");
		}else {
			amount=amount-amt;
			System.out.print(amt+"withdraw");
		}
	}
	
	
	//method to check the balance of the account
	
	void checkBalance() {
		System.out.print("Balance is: "+ amount);
	}
	
	void display() {
		System.out.print(acc_no+" "+name+" "+amount);
	}
	

}
