package ShimonLAB;

public class Atm {
	String dbName;
	Db db;
	Keyboard kbd;
	Screen scr;
	int user;
	String pass;
	int choice;
	int moneywithdraw;

public Atm(String dbName) {
	this.dbName = dbName;
	this.db = new Db(dbName);
	this.kbd = new Keyboard();
	this.scr = new Screen();
}
void go() {
	scr.displayGreetings();
	scr.displayAcctPrompt();
	user = kbd.getAcct();
	System.out.println();
	scr.displayPwPrompt();
	pass = kbd.getPassword();
	do {
		  scr.displayMainMenu();
		  choice = kbd.getChoice();
		  choices(choice);
		}
		while (!db.verify(user, pass) == true);
}
void choices(int choice) {
	switch(choice) {
	  case 1:
		  scr.displayBalance();
		  System.out.print(db.getBalance());
	    break;
	  case 2:
		  scr.displayWidrawMenu();
		 int amount = kbd.getChoice();
		 moneywithdraw = db.withdraw(amount);
		 scr.printConfirmation(moneywithdraw);
		 break;
	  case 3:
		  scr.DisplayDepositMenu();
		  double depositAmount = kbd.getDepositAmount();
		  db.deposit(depositAmount);
		  scr.printDeposit(depositAmount);
		break;
	  default:
		  System.exit(0);
		
	}
	
}

public static void main(String[] args) {
	Atm atm = new Atm("myDatabase");
	atm.go();
	
}
}