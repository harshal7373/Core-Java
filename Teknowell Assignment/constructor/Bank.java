package constructor;

public class Bank {

	int bId;
	String bName;
	String bBranch;
	double deposit;
	double withdraw;
	
	Bank(int bId, String bName, String bBranch){
		
		this.bId = bId;
		this.bName = bName;
		this.bBranch = bBranch;
		
		System.out.println("Bank Id: "+bId);
		System.out.println("Bank Name: "+bName);
		System.out.println("Bank Branch "+bBranch);
		
	}
	
	Bank(double deposit){
		
		if(deposit>=0) {
			System.out.println("You have deposited: "+deposit);
		}
		else {
			System.out.println("Please enter proper amount");
		}
		
	}
	
	Bank(double deposit, double withdraw){
		
		this.withdraw = withdraw;
		
		withdraw = deposit - withdraw;
		
		System.out.println("Money Withdraw: "+withdraw);
	}
	
	
	public static void main(String[] args) {
		
		Bank b1 = new Bank(101, "SBI", "Pune");
		
		Bank b2 = new Bank(90000);
		
		Bank b3 = new Bank(5000,2000);
		
	}
	
}
