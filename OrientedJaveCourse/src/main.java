import java.util.Random;
import java.util.Scanner;

public class main{
	public static void main(String[] args){
		int number1,number2,sum; // initialize
		Scanner reader = new Scanner(System.in); // initialize input
		System.out.println("enter first number");
		Random r = new Random(); // initialize random generator
		number1 = reader.nextInt(); // takes client input
		System.out.println("enter second number");
		number2 = reader.nextInt(); // number2 input
		reader.close(); // input must be closed!!
		sum = number1+number2; 
		int[] numbers = new int[10]; //creating 10 cells dimension 
		for(int i =1; i<numbers.length; i++) { // for loop from 1 to the matrix length
			numbers[i] = r.nextInt(100) + 1;
			System.out.print(numbers[i]);
		}
		if(number1%2==0) {
			System.out.println("number 1 is equal");
		}
		else{
			System.out.println("number 1 is not equal");
		}
		String name = "asaf";
		System.out.print(name+"\tthe sum is:");
		System.out.println(sum);
		System.out.println("divison is:"+(double)number1/number2); //Convention to double 
		System.out.print(isequal(number2));
	}
	public static boolean isequal(int number2) { // function returns boolean
		return number2%2==0;
	}
	
}