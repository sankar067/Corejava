abstract class Account{
	void openAccount(String AccType){
		System.out.println("Account Type : "+AccType);
	}
	
	abstract void getbalance();
}

class savingAccount extends Account{
	
	void getbalance(){
		System.out.println("Balance as per Saving account number");
	}
}

class salaryAccount extends Account{
	
	void getbalance(){
		System.out.println("Balance as per Salary account number");
	}
}
public class AbstractBankAccountDemo {

	public static void main(String[] args){
		savingAccount s = new savingAccount();
		s.openAccount("Saving Account");
		s.getbalance();
		
		salaryAccount sa = new salaryAccount();
		sa.openAccount("Salary Account");
		sa.getbalance();
		
	}
}
