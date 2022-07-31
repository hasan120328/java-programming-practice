package bankCal;

public class BankTest {

	public static void main(String[] args) {
		Bank a1=new Bank();
		a1.insert(2654 , "hasan", 1000);
		a1.display();
		a1.checkBalance();
		a1.deposit(4000);
		a1.checkBalance();
		a1.withdraw(15000);
		a1.checkBalance();
	}

}
