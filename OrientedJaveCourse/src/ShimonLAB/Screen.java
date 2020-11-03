package ShimonLAB;

public class Screen {
public Screen() {
	
}
public void displayGreetings() {
	System.out.println("Welcome!");
}
public void displayAcctPrompt() {
	System.out.print("Please enter your account number:");
	
}
public void displayPwPrompt() {
	System.out.print("Enter yor PIN:");
}
public void displayMainMenu() {
	System.out.println("Main menu");
	System.out.println("\t 1 - View my balance");
	System.out.println("\t 2 - Withdraw cash");
	System.out.println("\t 3 - Deposit funds");
	System.out.println("\t 4 - Exit");
	System.out.print("Enter a choice:");
}
public void displayWidrawMenu() {
	System.out.println("WithDrawal menu");
	System.out.println("\t 1 - 20$ \t 4 - 100$ ");
	System.out.println("\t 2 - 40$ \t 5 - 200$ ");
	System.out.println("\t 3 - 60$ \t 6 - Cancel transaction");
	System.out.print("Choose a withdrawal amount:");

}
public void displayBalance() {
	System.out.println("Balance menu");
	System.out.print("Your balance is:");

}
public void DisplayDepositMenu() {
	System.out.print("Please insert amount:");

}
public void displayWrongInput() {
	System.out.println("Wrong input !");
}
public void printConfirmation(int moneywithdraw){
	 System.out.printf("you have draw:%d\n",moneywithdraw);
}
public void printDeposit(double depositAmount) {
	 System.out.print("you have deposit:");
	 System.out.print(depositAmount);

}
}
