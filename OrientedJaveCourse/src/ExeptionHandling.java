import java.util.Scanner;
public class ExeptionHandling {
	public static void main(String[] args) {
		int arr[] = {1, 2, 3};
		for(int i=1; i <= arr.length; i++) { // should be int i = 0 i < arr.length
		    try {
			System.out.println(arr[i]);
		    } catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Illegal index");
		    }
		}
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Age:");
		int age = s.nextInt();
		if(age < 18) try {
			throw new AgeException("too young!!!");
		} catch (AgeException  e) {
			age = 21;
		}
		System.out.println(age);
		s.close();
		
}
}