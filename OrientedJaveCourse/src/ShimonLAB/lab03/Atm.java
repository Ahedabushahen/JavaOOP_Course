public class Atm {
	String dbName;
	private Db db;
	private Keyboard kbd;
	private Screen scr;
	public int user;
	public String pass;
	public int choice;
	public int moneywithdraw;

public Atm(String dbName) {
	this.dbName = dbName;
	this.db = new Db(dbName);
	this.kbd = new Keyboard();
	this.scr = new Screen();
}
public void go() {
	scr.displayGreetings();
	do {
	scr.displayAcctPrompt();
	user = kbd.getAcct();
	System.out.println();
	scr.displayPwPrompt();
	pass = kbd.getPassword();
		  scr.displayMainMenu();
		  choice = kbd.getChoice();
		  choices(choice);
		}
		while (!db.verify(user, pass) == true);
}
void choices(int choice) {
	while(choice != 4) {
	switch(choice) {
	  case 1: // view balance
		  double balance = db.getBalance();
		  scr.displayBalance(balance);
		  scr.displayMainMenu();
		  choice = kbd.getChoice();
		  choices(choice);
		  break;
	  case 2:
		  scr.displayWidrawMenu();
		 int amount = kbd.getChoice();
		 moneywithdraw = db.withdraw(amount);
		 if(moneywithdraw == 1) {
			 scr.printOverDraft();
			 scr.displayMainMenu();
			 choice = kbd.getChoice();
			 choices(choice);
		 }
		 scr.printConfirmation(moneywithdraw);
		 scr.displayMainMenu();
		 choice = kbd.getChoice();
		 choices(choice);
		 break;
	  case 3:
		  scr.DisplayDepositMenu();
		  double depositAmount = kbd.getDepositAmount();
		  db.deposit(depositAmount);
		  scr.printDeposit(depositAmount);
		  scr.displayMainMenu();
		  choice = kbd.getChoice();
		  choices(choice);
		  break;
	  default: 
		  System.exit(0);
	}
	}
	
}

public static void main(String[] args) {
	Atm atm = new Atm("myDatabase");
	atm.go();
	
}
}