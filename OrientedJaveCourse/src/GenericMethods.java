
public class GenericMethods {
	public static void main(String[] args) {
		//when creating generic methods, it can only work on object variables
		//make sure to use Integer or Double not int or double.
		Integer[] arr1 = {1,3,5,6};
		Double[] arr2 = {1.2,2.3,4.56,7.31,10.01};
		String[] arr3 = {"hello","my","Name","is"};
		printArr(arr1);
		printArr(arr2);
		printArr(arr3);
		}
	
	public static <T> void printArr(T[] Objects) {
		for(T obj: Objects) {
			System.out.println(obj+" ");
		}
		System.out.println();
	}
}
