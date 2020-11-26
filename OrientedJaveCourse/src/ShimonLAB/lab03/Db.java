package ShimonLAB.lab03;
public class Db {
	private double balance;
	String dbName;
	int acct;
	String pw;
	int moneywithdrawal;
public Db(String dbName){
		this.dbName = dbName;
		this.balance = 750; 
		
	}
public boolean verify(int acct,String pw) {
		return true;
	}
public void deposit(double amount) {
	balance += amount;
	return;
}
public int withdraw(int amount) {
	switch(amount) {
	  case 1:
		  if(balance < 20) {
			  return 1;
		  }
		  balance -= 20;
		  moneywithdrawal = 20;
		  
	    break;
	  case 2:
		  if(balance < 40) {
			  return 1;
		  }
		  balance -= 40;
		  moneywithdrawal = 40;
		  break;
	  case 3:
		  if(balance < 60) {
			  return 1;
		  }
		  balance -= 60;
		  moneywithdrawal = 60;
		  break;
	  case 4:
		  if(balance < 100) {
			  return 1;
		  }
		  balance -= 100;
		  moneywithdrawal = 100;
	    break;
	  case 5:
		  if(balance < 200) {
			  return 1;
		  }
		  balance -= 200;
		  moneywithdrawal = 200;
		  break;
	  default:
			  break;
	}
	return moneywithdrawal;
		
	}
public double getBalance() {
	return balance;
}

}