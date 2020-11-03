package ShimonLAB;
import java.util.Scanner; 

public class Keyboard {
	Scanner s;
	String password = null;
	double DepositAmount;
	int Acct = 0;
	int chioce = 0; // user choice in the main menu
public Keyboard() {
	s = new Scanner(System.in);	
}
public int getAcct() {

	if(s.hasNextInt())
		Acct = s.nextInt();
	return Acct;
}
public String getPassword(){

	if(s.hasNextLine())
		password = s.next();
	return password;
}


public int getChoice() {
	if(s.hasNextInt())
		chioce = s.nextInt();
	return chioce;
	}
public double getDepositAmount() {

	if(s.hasNextInt())
		DepositAmount = s.nextDouble();
	return DepositAmount;
}
}
